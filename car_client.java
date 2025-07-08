public class car_client {
    public static void main(String[] args) {
        car [] arr = new car[5];
        arr[0] = new car(200,10,"White");
        arr[1] = new car(1000, 20,"Black");
        arr[2]= new car(365,52,"Brown");
        arr[3] = new car(520,65,"green");
        arr[4] = new car(689,87,"Red");
        Display(arr);
    }
    public static void Display(car[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static <T extends Comparable<T>> void BubbleSort(T[] arr) {
    	for (int pass = 1; pass < arr.length; pass++) {// pass<=arr.lenght-1
    		for (int j = 0; j < arr.length - pass; j++) {
    			if (arr[j].compareTo(arr[j + 1]) > 0) {
    				T temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    			}
    		}
    	}

    }
    // public static <T> void BubbleSort(T[] arr, Comparator<T> camp) {
    //     for (int pass = 1; pass < arr.length; pass++) {// pass<=arr.lenght-1
    //         for (int j = 0; j < arr.length - pass; j++) {
    //             if (camp.compare(arr[j], arr[j + 1]) > 0) {
    //                 T temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    // }
}
