package CollectionFramework;

public class main {

    public static void main(String[] args) {

        KeywordAnalyzerImpl keywordAnalyzer = new KeywordAnalyzerImpl();

        keywordAnalyzer.recordKeyword("Toy");
        keywordAnalyzer.recordKeyword("Toy");
        keywordAnalyzer.recordKeyword("Bat");
        keywordAnalyzer.recordKeyword("Ball");
        keywordAnalyzer.recordKeyword("Bat");
        keywordAnalyzer.recordKeyword("Toy");
        keywordAnalyzer.recordKeyword("Ball");
        keywordAnalyzer.recordKeyword("Toy");
        keywordAnalyzer.recordKeyword("Bat");
        keywordAnalyzer.recordKeyword("Ball");
        keywordAnalyzer.recordKeyword("Toy");


        System.out.println(keywordAnalyzer.getFrequencyAndKeyword());
    }
}
