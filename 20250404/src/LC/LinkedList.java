package LC;
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class LinkedList {
    ListNode head;
    //复习：打印链表
    public void display(){
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.val + " ->");
            cur = cur.next;
        }
        System.out.println("null");//链表最后是null
    }
    //复习：尾插法
    public void insertAtTail(int data){
        //1.定义一个新的节点，放在原来链表的尾部
        ListNode newNode = new ListNode(data);
        //2.判断head是不是空的，即链表是不是空的
        //要是空的：head = newNode(直接让新定义的节点作为头节点：因为链表里没有节点)
        //void：直接return 就可以了
        if (head == null){
            head = newNode;
            return;
        }
        //3.要是链表不是空的：定义一个cur节点
        //让cur从head开始
        //往后遍历链表：直到cur.next == null,即链表的最后一个节点
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        //让cur.next = newNode，即最后一个节点的后面放新节点
        cur.next = newNode;
    }
    public ListNode deleteDuplicates() {
        //删除排序链表中的重复元素 20250404 task1
        //思路：注意while()内部的条件
        //删除节点只需要cur.next = cur.next.next就可以实现了
        //不需要fast, slow节点
        if (head == null) return null;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
