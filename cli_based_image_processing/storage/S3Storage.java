package cli_based_image_processing.storage;

public class S3Storage implements StorageStrategy {
  @Override
  public void store(String filePath, String destination) {
    // Logic to store file in AWS S3
    System.out.println("Storing " + filePath + " to AWS S3 at " + destination);
  }
}
