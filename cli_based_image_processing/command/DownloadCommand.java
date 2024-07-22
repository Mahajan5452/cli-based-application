package cli_based_image_processing.command;

public class DownloadCommand implements Command {
  private String fileUrl;
  private String localPath;
  private Command next;

  public DownloadCommand(String fileUrl, String localPath) {
    this.fileUrl = fileUrl;
    this.localPath = localPath;
  }

  @Override
  public String execute() {
    System.out.println("downloading from: " + fileUrl);
    System.out.println("download completed. File would be saved to: " + localPath);

    if (next != null) {
      return next.execute();
    }
    return localPath;
  }

  @Override
  public String getCommand() {
    return String.format("download --url %s --destination %s", fileUrl, localPath);
  }

  @Override
  public void setNext(Command next) {
    this.next = next;
  }
}

