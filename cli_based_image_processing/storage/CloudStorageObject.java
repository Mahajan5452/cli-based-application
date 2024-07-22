package cli_based_image_processing.storage;

public class CloudStorageObject {
  private StorageStrategy strategy;

  public void setStrategy(StorageStrategy strategy) {
    this.strategy = strategy;
  }

  public void storeFile(String filePath, String destination) {
    strategy.store(filePath, destination);
  }
}

