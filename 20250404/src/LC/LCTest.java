package LC;

public class LCTest {
    public static void main(String[] args) {
        LinkedList mytest = new LinkedList();
        mytest.insertAtTail(1);
        mytest.insertAtTail(2);
        mytest.insertAtTail(2);
        mytest.insertAtTail(4);
        mytest.insertAtTail(5);
        mytest.display();
        mytest.deleteDuplicates();
        mytest.display();
    }
}
