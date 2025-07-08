public class stack_implimentation {
	private int[] arr;
	int tos;
	

	public stack_implimentation() {
	
		arr = new int[5];
		tos = -1;
	}
	public stack_implimentation(int n) {
		
		arr = new int[n];
		tos = -1;
	}
	public boolean isEmpty() {
		return tos == -1;
	}
	public boolean isfull() {
		return tos == arr.length - 1;
	}
	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol stack full hai");
		}
		tos++;
		arr[tos] = item;
	}
	public int size() {
		return tos + 1;
	}

	public int pop() throws Exception {
		
		if (isEmpty())  {
			throw new Exception("Bklol stack Empty hai");
		}
        int x = arr[tos];
		tos--;
	    return  x;
		
		
	}

	public int peek() throws Exception {
		
		if (isEmpty()) {
			throw new Exception("Bklol stack Empty hai");
		}
		return arr[tos];
	
	}
	public void Display() {
		for (int i = 0; i <= tos; i++) {
			System.out.print(arr[i] + "->");
		}
		System.out.println(".");
	}
    public static void main(String [] args) throws Exception{
        stack_implimentation s = new stack_implimentation();
         s.push(10);
         s.push(20);
         s.push(40);
         s.push(30);
         s.push(220);
         s.size();
         System.out.println(s.pop());
         System.out.println(s.peek());
         s.Display();
     }
}
