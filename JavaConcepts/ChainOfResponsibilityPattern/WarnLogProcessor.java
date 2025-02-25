package ChainOfResponsibilityPattern;

public class WarnLogProcessor extends RequestLogProcessor{
    public WarnLogProcessor(RequestLogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String logType, String message) {

        if (logType=="WARN"){
            System.out.println("WARN: "+message);
        }
        else{
            super.log(logType, message);
        }

    }
}
