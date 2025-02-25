package ChainOfResponsibilityPattern;

public class MainLogging {

    public static void main(String[] args) {
        RequestLogProcessor logProcessor = new InfoLogProcessor(new WarnLogProcessor(null));

        logProcessor.log("INFO","entering info log message");
    }
}
