package cli_based_image_processing.command;

public interface ExternalService {
  String process(String inputImage,Object clientInformation);
}

