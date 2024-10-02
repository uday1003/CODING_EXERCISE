import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Main class to run the Mars Rover simulation with a menu-driven interface.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get grid size
        System.out.print("Enter grid size (e.g., 10 10): ");
        String[] gridSizeInput = scanner.nextLine().split(" ");
        int gridWidth = Integer.parseInt(gridSizeInput[0]);
        int gridHeight = Integer.parseInt(gridSizeInput[1]);

        // Get starting position
        int startX = 0, startY = 0;
        Direction startDirection = Direction.N; // Default direction

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter starting position (e.g., 0 0 N): ");
                String[] startingPositionInput = scanner.nextLine().split(" ");
                startX = Integer.parseInt(startingPositionInput[0]);
                startY = Integer.parseInt(startingPositionInput[1]);
                startDirection = Direction.valueOf(startingPositionInput[2].toUpperCase());
                validInput = true; // Set to true if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter in the format 'x y Direction' (e.g., '0 0 N').");
            }
        }

        // Get obstacles
        System.out.print("Enter obstacles as (x,y) pairs, e.g., 2 2 3 5 (type 'done' to finish): ");
        Set<Position> obstacles = new HashSet<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            String[] obstacleCoordinates = input.split(" ");
            for (int i = 0; i < obstacleCoordinates.length; i += 2) {
                int obstacleX = Integer.parseInt(obstacleCoordinates[i]);
                int obstacleY = Integer.parseInt(obstacleCoordinates[i + 1]);
                obstacles.add(new Position(obstacleX, obstacleY));
            }
        }

        // Create the Rover at the specified starting position and direction
        Rover rover = new Rover(startX, startY, startDirection, obstacles);

        // Create a command invoker
        CommandInvoker invoker = new CommandInvoker();

        // Get commands
        System.out.print("Enter commands as a string (e.g., MMRML): ");
        String commandsInput = scanner.nextLine().toUpperCase();
        for (char commandChar : commandsInput.toCharArray()) {
            switch (commandChar) {
                case 'M':
                    invoker.addCommand(new MoveCommand(rover));
                    break;
                case 'L':
                    invoker.addCommand(new TurnLeftCommand(rover));
                    break;
                case 'R':
                    invoker.addCommand(new TurnRightCommand(rover));
                    break;
                default:
                    System.out.println("Invalid command: " + commandChar);
            }
        }

        // Execute commands
        invoker.executeCommands();

        // Print the final status report
        System.out.println("Final Position: (" + rover.getX() + ", " + rover.getY() + ", " + rover.getDirection() + ")");
        System.out.println(rover.statusReport());
    }
}
