package hashmap;
import java.util.*;
public class hash {
    public static void main(String[] args) {
        // treemap ko impliment krane ke liye red black tree ka use hota h 
        // treemap me null as a key nhi daal  skte
        // treemap me sorting algorithm use hota h
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Raj",69);
        map.put("Ayush", 90);
        map.put("Kunal",98);
        map.put("Aryan", 95);
        map.put("Mittal",99);
        map.put("Amisha",90);
        System.out.println(map);
        //Linked List 
        // linkdedhashmap me null ko as a key use kr skte h 
        //Linkedhashmap ko impliment doubly linkedlist se krte h
        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
        map1.put("Raj",69);
        map1.put("Ayush", 90);
        map1.put("Kunal",98);
        map1.put("Aryan", 95);
        map1.put("Mittal",99);
        map1.put("Amisha",90);
        System.out.println(map1);
        // map ko print krne ke liye
        Set<String> key = map.keySet();
        for(String K: key){
            System.out.println(K+" "+ map.get(K));
        }
    }
}
