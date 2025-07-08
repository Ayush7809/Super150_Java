import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedList_oops<T> {
    public class Node {
        T val;
        Node next = null;
    }

    private Node head;
    private int size;
    private Node tail;

    public void addfirst(T item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            nn.next = head;
            head = nn;
            this.size++;
        }
    }

    public void addlast(T item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            addfirst(item);
        } else {
            tail.next = nn;
            tail = nn;
            this.size++;
        }
    }

    public void addatindex(T item, int k) throws Exception {
        if (k < 0 || k > size) {
            throw new Exception("baklol");
        }
        if (k == 0)
            addfirst(item);
        else if (k == size)
            addlast(item);
        else {
            Node nn = new Node();
            nn.val = item;
            Node extra = getnode(k - 1);
            nn.next = extra.next;
            extra.next = nn;
            size++;
        }
    }

    public T remfirst() throws Exception {
        if (size == 0)
            throw new Exception("baklol");
        T vi = head.val;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            size--;
        }
        return vi;
    }

    public T remlast() throws Exception {
        if (size == 0)
            throw new Exception("baklol");
        else if (size == 1)
            return remfirst();
        else {
            T vi = head.val;
            Node extra = head;
            while (extra.next != null)
                extra = extra.next;
            extra.next = null;
            tail = extra;
            size--;
            return vi;
        }
    }

    public T remin(int k) throws Exception {
        if (k < 0 || k > size) {
            throw new Exception("baklol");
        }
        if (k == 0)
            return remfirst();
        else if (k == size)
            return remlast();
        else {
            Node extra = getnode(k - 1);
            Node temp = extra.next;
            extra.next = extra.next.next;
            temp.next = null;
            size--;
            return extra.next.val;
        }
    }

    public void display() {
        Node extra = new Node();
        extra = head;
        while (extra != null) {
            System.out.print(extra.val + " ");
            extra = extra.next;
        }
    }

    public Node getnode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("baklol");
        }
        Node temp = head;
        for (int i = 1; i <= k; i++)
            temp = temp.next;
        return temp;
    }

    public T getfirst() {
        return head.val;
    }

    public T getlast() {
        return tail.val;
    }

    public T getindex(int k) throws Exception {
        return getnode(k).val;
    }
    public static void main(String[] args) {
        LinkedList_oops<String> ll = new LinkedList_oops<>();
        ll.addlast("ku");
        ll.addlast("oop");
        ll.addlast("pop");
        ll.display();
    }
}