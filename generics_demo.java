public class generics_demo {
    // generic me non premitive data ke liye define hota h 
    // generic fxn ka mtlb ek aisa fxn jisme hm koi bhi data type ko print kr denge
    public static void main(String[] args) {
        Integer [] arr = {10,20,30,56,658,85};
        Display(arr);
        System.out.println();
        String [] arr1 = {"Ram","Ayush","Monu","Ankita","kunal"};
        Display(arr1);
    }
    public static<A> void Display(A[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
