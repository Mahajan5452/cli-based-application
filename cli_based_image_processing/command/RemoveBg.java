package cli_based_image_processing.command;

public class RemoveBg implements Command {
  private String inputPath;
  private String outputPath;
  private Command next;
  private ExternalService externalService;

  public RemoveBg(String inputPath, String outputPath) {
    this.inputPath = inputPath;
    this.outputPath = outputPath;
  }

  @Override
  public String execute() {
    System.out.println("Executing bg remove call");
    externalService = new BgRemoveClient();
    outputPath = externalService.process(inputPath,new Object());

    System.out.println("Bg remove call get success full");
    if (next != null) {
      return next.execute();
    }
    return outputPath;
  }

  @Override
  public String getCommand() {
    return String.format("remove-bg %s", inputPath);
  }

  @Override
  public void setNext(Command next) {
    this.next = next;
  }
}

