package hashmap;
import java.util.*;
public class set_demo {
    // set is a interface
    // hashset , treeset, Linked hashset
    // set ko impliment hashtable se hoga
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(30);
        set.add(-2);
        set.add(90);
        set.add(5);
        System.out.println(set);
        // System.out.println(set.contains(4));
        // System.out.println(set.remove(5));
        // System.out.println(set.size());
        TreeSet <Integer> set1 = new TreeSet<>();
        set1.add(4);
        set1.add(5);
        set1.add(30);
        set1.add(-2);
        set1.add(90);
        set1.add(5);
        System.out.println(set1);

        LinkedHashSet <Integer> set2 = new LinkedHashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(30);
        set2.add(-2);
        set2.add(90);
        set2.add(5);
        System.out.println(set2);
        for(int val: set){
            System.out.println(val+" ");
        }
    }
}
