import java.util.ArrayList;
public class heap{
    private ArrayList<Integer> list;
    public heap(){
        list = new ArrayList<>();
    }
    public void add(int item){
        list.add(item);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci){
        int pi = (ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    public void swap(int pi, int ci){
        int temp = list.get(pi);
        list.set(pi,list.get(ci));
        list.set(ci , temp);
    }
    public int remove(){
        int rv = list.get(0);
        swap(0, list.size()-1);
        list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }
    private void downheapify(int pi){
        int lci = 2*pi+1;// lci = left child index
        int rci = 2*pi+2; // rci = right child index
        int min = pi;
        if(lci<list.size() && list.get(lci)<list.get(min)){
            min = lci;
        }
        if(rci<list.size() && list.get(rci)<list.get(min)){
            min = rci;
        }
        if(min!=pi){
            swap(pi,min);
            downheapify(min);
        }
    }
    public int get_min(){
        return list.get(0);
    }
    public void Display(){
        System.out.println(list);
    }
}