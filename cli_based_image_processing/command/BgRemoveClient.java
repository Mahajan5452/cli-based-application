package cli_based_image_processing.command;

public class BgRemoveClient implements ExternalService{
  @Override
  public String process(String inputImage, Object clientInformation) {
    // calling the bg remove service
    System.out.println("Calling Bg remove service and returning the output path ");
    return "OutputPath";
  }
}
