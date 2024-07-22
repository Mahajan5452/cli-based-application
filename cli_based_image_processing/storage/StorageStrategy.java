package cli_based_image_processing.storage;

public interface StorageStrategy {
  void store(String filePath, String destination);
}
