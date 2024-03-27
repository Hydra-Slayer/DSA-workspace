public class lnkedLst {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        lnkedLst llist = new lnkedLst();
        llist.head = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        
        //linking all the nodes
        llist.head.next = second;
        second.next = third;
        third.next = fourth;

        //fx calls
        llist.display();
    }
}