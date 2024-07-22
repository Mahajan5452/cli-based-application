package cli_based_image_processing.command;

import cli_based_image_processing.pojo.CropMargins;

import java.util.logging.Logger;

public class CropCommand implements Command {
  private CropMargins cropMargins;
  private String outputPath;
  private String inputPath;
  private Command next;

  public CropCommand(CropMargins cropMargins, String inputPath, String outputPath) {
    this.cropMargins = cropMargins;
    this.inputPath = inputPath;
    this.outputPath = outputPath;
  }

  @Override
  public String execute() {
    System.out.println("Executing Crop Command:");
    System.out.println("With command as: " + getCommand());
    if (next != null) {
      return next.execute();
    }
    return outputPath;
  }

  @Override
  public String getCommand() {
    return String.format("crop --top %d --right %d --bottom %d --left %d %s",
                         cropMargins.getTop(), cropMargins.getRight(), cropMargins.getBottom(),
                         cropMargins.getLeft(), inputPath);
  }

  @Override
  public void setNext(Command next) {
    this.next = next;
  }
}