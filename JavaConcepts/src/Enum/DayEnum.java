package Enum;

public enum DayEnum {

    MONDAY(1,"MON"){
        @Override
        public void printGreeting(){
            System.out.println("today is monday");
        }
    },
    TUESDAY(2,"TUES"){
        @Override
        public void printGreeting(){
            System.out.println("today is tuesday");
        }
    },
    WEDNESDAY(3,"WED"){
        @Override
        public void printGreeting(){
            System.out.println("today is wednesday");
        }
    };

    private int key;
    private String shortDate;

    private DayEnum(int key, String shortDate){
        this.key = key;
        this.shortDate =shortDate;
    }

    public int getKey(){
        return key;
    }

    public abstract void printGreeting();



}
