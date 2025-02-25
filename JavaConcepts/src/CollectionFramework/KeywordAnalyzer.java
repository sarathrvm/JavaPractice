package CollectionFramework;

import java.util.List;

public interface KeywordAnalyzer {

    public void recordKeyword(String keyword);

    List<KeywordAndFrequency> getFrequencyAndKeyword();
}
