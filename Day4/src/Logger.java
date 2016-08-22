public class Logger {
    private static Logger logger;
    private static String logFile = "This is log file! \n";

    private Logger() {
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.logger) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void add(String info) {
        logFile = logFile + info + "\n";
    }

    public void show() {
        System.out.println(logFile);
    }
}
