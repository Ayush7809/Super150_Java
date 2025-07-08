
import java.util.*;
public class hashmap_implimentation<K,V>{
    class Node{
        K key;
        V value;
        Node next;
    }
    private int size=0;
    ArrayList<Node> ll;
    public hashmap_implimentation(int n){
        ll = new ArrayList<>();
        for(int i=0;i<n;i++){
            ll.add(null);
        }
    }
    public hashmap_implimentation(){
        this(4);
    }
    public int hashfun(K key){
        int bn = key.hashCode()%ll.size();
        if(bn<0)
            bn+=ll.size();
        return bn;
    }
    public void put(K key, V value){
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        temp = ll.get(idx);
        nn.next = temp;
        ll.set(idx, nn);
        size++;
        double thf = 2.0;
        double lf = (1.0 * size) / ll.size();
        if (lf > thf) {
            rehashing();
        }
    }
    private void rehashing() {
        ArrayList<Node> new_List = new ArrayList<>();
        for (int i = 0; i < 2 * ll.size(); i++)
        {
            new_List.add(null);
        }
        ArrayList<Node> oba = ll;
        ll = new_List;
        for(Node temp:oba)
        {
            while(temp!=null)
            {
                put(temp.key, temp.value);
                temp = temp.next;
            }
        }
    }
    public V get(K key){
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
    public V remove(K key){
        int idx = hashfun(key);
        Node curr = ll.get(idx);
        Node prev = null;
        while(curr!=null){
            if(curr.key== key){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if(curr==null){
            return null;
        }
        else if(prev == null){
            ll.set(idx, curr.next);
            curr.next = null;
            size--;
            return curr.value;
        }
        else{
            prev.next = curr.next;
            curr.next=  null;
            size--;
            return curr.value;
        }
    }
   @Override
public String toString() {
    StringBuilder s = new StringBuilder("{");
    for (Node current : ll) {
        Node temp = current;
        while (temp != null) {
            s.append(temp.key).append("=").append(temp.value).append(",");
            temp = temp.next;
        }
    }
    if (s.length() > 1) {
        // Remove the trailing comma
        s.setLength(s.length() - 1);
    }
    s.append("}");
    return s.toString();
}

    public static void main(String[] args) {
        hashmap_implimentation<String,Integer> map = new hashmap_implimentation<>();
        map.put("Raj",69);
        map.put("Ayush", 90);
        map.put("Kunal",98);
        map.put("Aryan", 95);
        map.put("Mittal",99);
        map.put("Amisha",90);
        System.out.println(map);
    }
}