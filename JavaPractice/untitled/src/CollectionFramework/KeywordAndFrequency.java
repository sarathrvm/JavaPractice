package CollectionFramework;

public class KeywordAndFrequency {

    private String keyword;

    private int frequency;

    public KeywordAndFrequency(String keyword, int frequency) {
        this.keyword = keyword;
        this.frequency = frequency;
    }

    public KeywordAndFrequency() {
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "KeywordAndFrequency{" +
                "keyword='" + keyword + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
