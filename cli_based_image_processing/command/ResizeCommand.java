package cli_based_image_processing.command;


public class ResizeCommand implements Command {
  private int newWidth;
  private int newHeight;
  private String outputPath;
  private String inputPath;
  private Command next;

  public ResizeCommand(int newWidth, int newHeight, String inputPath, String outputPath) {
    this.newWidth = newWidth;
    this.newHeight = newHeight;
    this.inputPath = inputPath;
    this.outputPath = outputPath;
  }

  @Override
  public String execute() {
    System.out.println("Executing Resize Command:");
    System.out.println("With command as: " + getCommand());
    if (next != null) {
      return next.execute();
    }
    return outputPath;
  }

  @Override
  public String getCommand() {
    return String.format("resize --width %d --height %d %s",
                         newWidth, newHeight, inputPath);
  }

  @Override
  public void setNext(Command next) {
    this.next = next;
  }
}