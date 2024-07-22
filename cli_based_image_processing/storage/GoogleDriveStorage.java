package cli_based_image_processing.storage;

public class GoogleDriveStorage implements StorageStrategy {
  @Override
  public void store(String filePath, String destination) {
    // Logic to store file in Google Drive
    System.out.println("Storing " + filePath + " to Google Drive at " + destination);
  }
}
