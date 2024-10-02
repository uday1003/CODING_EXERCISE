import java.util.Set;

/**
 * Class representing the Rover which can move around the grid.
 */
public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private Set<Position> obstacles;

    public Rover(int x, int y, Direction direction, Set<Position> obstacles) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.obstacles = obstacles;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move() {
        int newX = x;
        int newY = y;

        switch (direction) {
            case N:
                newY++;
                break;
            case E:
                newX++;
                break;
            case S:
                newY--;
                break;
            case W:
                newX--;
                break;
        }

        // Check for obstacles
        if (!obstacles.contains(new Position(newX, newY))) {
            x = newX;
            y = newY;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case N:
                direction = Direction.W;
                break;
            case W:
                direction = Direction.S;
                break;
            case S:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.N;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case N:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.S;
                break;
            case S:
                direction = Direction.W;
                break;
            case W:
                direction = Direction.N;
                break;
        }
    }

    public String statusReport() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction + ". No Obstacles detected.";
    }
}
