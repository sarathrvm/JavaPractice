package ChainOfResponsibilityPattern;

public abstract class RequestLogProcessor {

    RequestLogProcessor nextLogProcessor;

    public RequestLogProcessor(RequestLogProcessor logProcessor){
        this.nextLogProcessor = logProcessor;
    }

    public void log(String logType,String message){
        if(nextLogProcessor!= null){
            nextLogProcessor.log(logType,message);
        }
    }

}
