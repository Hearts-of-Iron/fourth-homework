import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by tengf on 2016/11/4.
 */
public class AssemblageList {
    public List<String> getList() {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        return strings;
    }


    public void assemblagelist(List<String> strings) {
        System.out.println("first");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("second");
        for (String value : strings) {
            System.out.println(value);
        }
        System.out.println("third");
        Iterator<String> itr = strings.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
        System.out.println("fourth");
        for (int j = strings.size() - 1; j >= 0; j--) {
            strings.get(j);
            System.out.println(strings.get(j));
        }
        System.out.println("fifth");
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
        public static void main (String[]args){
            AssemblageList test = new AssemblageList();
            List<String> strings = test.getList();
            test.assemblagelist(strings);
        }
    }
