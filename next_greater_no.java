import java.util.Stack;

public class next_greater_no {
    public static void main(String[] args) {
        int[] arr = {11,2,3,23,13,9,15};
        NGE(arr);
    }
    public static void NGE (int [] arr){
        int [] nge = new int [arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            //nge
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int x = st.pop();
                nge[x] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int x = st.pop();
            nge[x] = -1;
        }
        for(int i=0;i<nge.length;i++){
            System.out.println(arr[i]+ " "+ nge[i]);
        }
    }
}
