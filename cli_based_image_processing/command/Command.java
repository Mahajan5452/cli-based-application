package cli_based_image_processing.command;

public interface Command {
  String execute();
  String getCommand();
  void setNext(Command command);
}
