package hashmap;

import java.util.*;

public class hashMap{
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        // map is interface h but hashmap class h
        //hashmap me do value hogi ek key aur dusri value like distictnory
        // hashmap me key hmesha unique hota 
        // agar ayush naam se koi aur entry krenge to do baar n print krke ayush ke marks ko update kr dega
        //hashmap ki time complexity o(1) time hota h  
        // hashmap ki implimentation LinkedList se hoti h
        //Hashmap me null as a key use kr skte h
        map.put("Raj",69);
        map.put("Ayush", 90);
        map.put("Kunal",98);
        map.put("Aryan", 95);
        map.put("Mittal",99);
        map.put("Amisha",90);
        System.out.println(map);
        // get
        // System.out.println(map.get("Ayush"));
        // //remove
        // System.out.println(map.remove("Amisha"));
        // //contain
        // System.out.println(map.containsKey("Ayush"));
        // System.out.println(map);
        Set<String> key = map.keySet();
        for(String K: key){
            System.out.println(K+" "+ map.get(K));
        }
    }
}