public class LogManager {
    private static LogManager instance;

    // Private constructor to prevent instantiation
    private LogManager() {}

    // Public method to provide a global point of access
    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
