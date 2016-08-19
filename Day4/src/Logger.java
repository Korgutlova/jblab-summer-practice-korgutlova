public class Logger {
    private static Logger logger;
    private static String logFile = "This is log file! \n";

    private Logger() {
    }

    public static synchronized Logger getLogger() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void add(String info) {
        logFile = logFile + info + "\n";
    }

    public void show() {
        System.out.println(logFile);
    }
}
