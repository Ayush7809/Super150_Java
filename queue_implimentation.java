public class queue_implimentation {
    private int [] arr;
    private int front =0;
    private int size =0;
    public queue_implimentation(){
        this.arr = new int [5];
    }
    public queue_implimentation(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public boolean isfull(){
        return size == arr.length;
    }
    public int size(){
        return size;
    }
    public void Enqueue(int item) throws Exception{
        if(isfull())
            throw new Exception("this Stack is full");
        int idx = (size+front)%arr.length;
        arr[idx] = item;
        size++;
    }
    public int Dequeue() throws Exception{
        if(isEmpty())
            throw new Exception("this stack is Empty");
        int rv = arr[front];
        front = (front+1)%arr.length;
        size--;
        return rv;
    }
    public int getfront() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty");
        return arr[front];
    }
    public void Display(){
        for(int i=0;i<size;i++){
            int idx = (front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception{
        queue_implimentation q = new queue_implimentation();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Display();
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Display();
        //q.Enqueue(70);
        q.Enqueue(80);
        q.Enqueue(90);
        System.out.println(q.getfront());
        q.Display();
    }
}