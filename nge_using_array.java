public class nge_using_array {
    public static void main(String[] args) {
        int[] arr = {11,2,3,23,13,9,15};
        NGE(arr);
    }
    public static void NGE(int [] arr){
        int n = arr.length;
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = -1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    nums[i] = arr[j];
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" "+nums[i]);
        }
    }
}
