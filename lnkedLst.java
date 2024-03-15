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
        while (current!=null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        lnkedLst lls = new lnkedLst();
        lls.head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(8);
        ListNode fifth = new ListNode(11);

        lls.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        
        lls.display();

    }
}
