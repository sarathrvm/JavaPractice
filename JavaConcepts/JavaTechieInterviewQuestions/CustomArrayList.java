package JavaTechieInterviewQuestions;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }
        return super.add(o);
    }
}
