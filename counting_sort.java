import java.util.*;
public class counting_sort{
    public static void main(String[] args) {
        int [] arr = {2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
        arr = Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] Sort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int [] freq = new int [max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i] = freq[i-1]+freq[i];
        }
        int [] ans = new int [arr.length];
        for(int i= arr.length-1;i>=0;i--){
            int c = freq[arr[i]]-1;
            ans[c] = arr[i];
            freq[arr[i]]--; 
        }
        return ans;
    }
}