public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of LogManager
        LogManager logManager = LogManager.getInstance();
        
        // Use the log manager to log messages
        logManager.log("This is the first log message.");
        logManager.log("Singleton pattern ensures one instance.");
        
        // Verify that the same instance is returned
        LogManager anotherLogManager = LogManager.getInstance();
        if (logManager == anotherLogManager) {
            System.out.println("Both are the same instance.");
        }
    }
}
