package StringBufferAndBuilder;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Sarath");
        sb.append(" Kumar");

        StringBuffer stringBuffer = new StringBuffer("Sarath");
        stringBuffer.append(" Kumar");

        System.out.println(sb);
        System.out.println(stringBuffer);
    }
}
