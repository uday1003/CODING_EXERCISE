import java.util.ArrayList;
import java.util.List;

/**
 * Class to invoke commands for the Rover.
 */
public class CommandInvoker {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
