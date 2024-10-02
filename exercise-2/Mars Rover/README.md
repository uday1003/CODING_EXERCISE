Mars Rover Programming Exercise
Problem Statement
The Mars Rover Programming Exercise simulates the navigation of a Mars rover on a grid-based terrain. The rover can move forward, turn left, and turn right while avoiding obstacles and staying within the grid's boundaries. The goal of this exercise is to create an Object-Oriented solution using design patterns to handle movement commands and obstacle detection efficiently without using traditional if-else constructs.

Classes and Design Overview
1. MarsRover
Represents the main class that controls the rover's behavior, including its movement and direction on the grid.
Responsibilities:
Executes movement commands (M, L, R).
Maintains the current position (x, y) and direction (N, E, S, W).
Ensures the rover avoids obstacles and stays within the grid boundaries.
2. Direction
An enum that defines the four possible directions (N, E, S, W) the rover can face.
Responsibilities:
Provides methods to determine the next direction when turning left or right.
Determines the movement logic for the rover when facing a specific direction.
3. Command (Command Pattern)
Abstract class or interface used to represent the Command Pattern for encapsulating commands (M for move, L for turn left, and R for turn right).
Responsibilities:
Defines a unified way to execute commands on the rover, making the addition of new commands flexible and maintainable.
4. MoveCommand, LeftCommand, RightCommand
Concrete implementations of the Command interface.
Responsibilities:
MoveCommand: Moves the rover one step forward in the current direction if there are no obstacles.
LeftCommand: Turns the rover 90 degrees to the left.
RightCommand: Turns the rover 90 degrees to the right.
5. Grid
Represents the grid on which the rover navigates, including boundaries and obstacles.
Responsibilities:
Defines the grid size and maintains the list of obstacles.
Validates the rover's movement to ensure it stays within the grid and avoids obstacles.
6. Position
Represents the rover's current coordinates (x, y) on the grid.
Responsibilities:
Encapsulates the rover's position and provides methods to update and retrieve the current coordinates.
Validates whether a new position contains an obstacle.
7. Obstacle
Represents an obstacle on the grid.
Responsibilities:
Stores obstacle coordinates and ensures the rover doesn’t move into an obstacle.
Interacts with the Grid and Position classes to validate movement.
Features
Initialize the grid with specified size (e.g., 10x10) and define obstacles on the grid.
Set the starting position and direction for the rover (e.g., (0, 0, N)).
Execute a series of commands (M for move, L for left turn, R for right turn).
Detect and prevent movement into obstacles.
Stay within grid boundaries.
Optional: Provide a status report including the rover’s current position and direction after executing commands.
Design Patterns Used
Command Pattern: Encapsulates movement commands (M, L, R) into separate objects to ensure flexibility and extendability.
Composite Pattern: Represents the grid as a composite of cells, obstacles, and rover movements to handle complex grid navigation.
OOP Principles: Ensures encapsulation, polymorphism, and inheritance for clean, maintainable code.