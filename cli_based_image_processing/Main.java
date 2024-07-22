package cli_based_image_processing;

import cli_based_image_processing.command.CropCommand;
import cli_based_image_processing.command.DownloadCommand;
import cli_based_image_processing.command.RemoveBg;
import cli_based_image_processing.command.ResizeCommand;
import cli_based_image_processing.pojo.CropMargins;
import cli_based_image_processing.storage.S3Storage;
import cli_based_image_processing.storage.StorageStrategy;

public class Main {
  public static void main(String[] args) {
    String inputImage = "input.jpg";
    CropMargins cropMargins = new CropMargins(10, 10, 10, 10);

    // Create CropCommand
    CropCommand cropCommand = new CropCommand(cropMargins, inputImage, "cropped_output.jpg");

    // Create Background Removal Command
    RemoveBg removeBgCommand = new RemoveBg("cropped_output.jpg", "bg_removed_output.jpg");

    // Create ResizeCommand
    ResizeCommand resizeCommand = new ResizeCommand(1000, 600, "bg_removed_output.jpg", "final_output.jpg");

    // Set up the command chain: Crop -> Remove Background -> Resize
    cropCommand.setNext(removeBgCommand);
    removeBgCommand.setNext(resizeCommand);

    System.out.println("Combined Command: " + cropCommand.getCommand());
    cropCommand.execute();
    StorageStrategy s3Storage = new S3Storage();
    s3Storage.store("final_output.jpg", "s3://mybucket/final_output.jpg");

    System.out.println("File stored to S3 successfully.");
    DownloadCommand downloadCommand = new DownloadCommand("s3://mybucket/final_output.jpg", "local_final_output.jpg");
    downloadCommand.execute();

  }

}
