package CollectionFramework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeywordAnalyzerImpl implements KeywordAnalyzer{

    Map<String,KeywordAndFrequency> datastore = new HashMap<>();

    @Override
    public void recordKeyword(String keyword) {

        if(datastore.containsKey(keyword)){
            KeywordAndFrequency keywordAndFrequency = datastore.get(keyword);
            datastore.put(keyword,new KeywordAndFrequency(keyword, keywordAndFrequency.getFrequency()+1));
        }
        else{
            datastore.put(keyword,new KeywordAndFrequency(keyword,1));
        }

    }

    @Override
    public List<KeywordAndFrequency> getFrequencyAndKeyword() {
       return datastore.values().stream().map(o1->new KeywordAndFrequency(o1.getKeyword().toLowerCase(),o1.getFrequency()))
               .sorted((o1,o2)->{
            if(o1.getFrequency()== o2.getFrequency()){
               return o2.getKeyword().compareTo(o1.getKeyword());
            }
            else{
                return o2.getFrequency()- o1.getFrequency();
            }
        }).toList();

    }
}
