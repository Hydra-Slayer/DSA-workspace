public class srtLinkedList {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current!=null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }



    public void removeDuplicates(){
        ListNode current = head;
        while (current!=null && current.next!=null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public ListNode insert(int data){
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        ListNode temp = null;
        while (current!=null && current.data<newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void remove(int key){
        ListNode current = head;
        ListNode temp = null;
        if (current !=null && current.data == key) {
            head = current.next;
            return;
        }
        while (current!=null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) return;
        temp.next = current.next;
    }
    
    public static void main(String[] args) {
        srtLinkedList srtlst = new srtLinkedList();
        srtlst.head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        srtlst.head.next = second;
        second.next = third;
        third.next = fourth;

        srtlst.display();
        
        //fx calls
        // srtlst.removeDuplicates();
        // srtlst.display();

        srtlst.insert(4);
        srtlst.display();

        srtlst.remove(1);
        srtlst.display();
    }
}