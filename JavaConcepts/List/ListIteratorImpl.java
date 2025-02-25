package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIteratorImpl {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(7);
        integerList.add(10);


        //we should provide the index from where to start

        ListIterator<Integer> listIterator = integerList.listIterator(3);

        Iterator<Integer> iterator = integerList.iterator();

       while (listIterator.hasPrevious()){
           System.out.println(listIterator.next());
           System.out.println(listIterator.previous());

           System.out.println(listIterator.next());
           System.out.println(listIterator.previous());
       }

       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }


//       ThreadSafe version of Arraylist

        List<Integer> integerList1 = new CopyOnWriteArrayList<>();
       integerList1.add(1);
       integerList1.add(2);



    }
}
