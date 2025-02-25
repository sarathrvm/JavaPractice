public class WrapperExamples {

    private int a=1;
    private Integer b =2;

    private String c="3";

    public static void main(String[] args){
        WrapperExamples wrapperExamples = new WrapperExamples();
        wrapperExamples.go();

    }

    public void go(){
        System.out.println(a);
        a=b;
        System.out.println(a);
        a=Integer.parseInt(c);

        System.out.println(a);
       String s= String.format("my formatted string is %,d",a);
       System.out.println(s);
    }

}
