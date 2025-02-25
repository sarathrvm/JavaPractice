package ChainOfResponsibilityPattern;

import java.util.Objects;

public class InfoLogProcessor extends RequestLogProcessor{
    public InfoLogProcessor(RequestLogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String logType,String message){
        if (Objects.equals(logType, "INFO")){
            System.out.println("INFO: "+message);
        }
        else{
            super.log(logType, message);
        }
    }
}
