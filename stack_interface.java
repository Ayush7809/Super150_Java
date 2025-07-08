public interface stack_interface extends dynamic_interface,data_structure_I{
    // all method interface are abstract
    // abstract se phle agar public ke bina koi fxn define kiya gya ho to default ke jaisa kaam krega
    public void push(int item);

    public int pop();
    
    public int peek();
//kisi variable me agar final keyword lg gya to uski value nhi change hoti 
//kisi method ke samne agar final keyword lga to vo method override nhi hoga
//kisi class ke samne agar final keyword lg gya to class inheritence nhi hoga
    public static final int x =9;
// aisi method jo by nature default ho use body de skte h interface me ye java8 me feature h
//     default void fun(){

//     }
// // java8 me public static method me body de skte h
//     public static int fun1(){
//         return 0;
//     }
// //java9 me private method ko bhi body de skte h
//     private int fun2(){
//         return 0;
//     }
}
