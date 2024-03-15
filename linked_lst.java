public class linked_lst {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data= data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    //counnt the length of linked list. 
    public void countNodes(){
        int count = 0;
        ListNode curr = head;
        while (curr!=null) {
            count++;
            curr = curr.next;
        }
        System.out.println(count);
    }
    public void insertFirst(int data){
        ListNode current = head;
        ListNode newNode = new ListNode(data);
        newNode.next = current;
        head = newNode;
    }
    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if (head==null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null!=current.next) {
            current=current.next;
        }
        current.next = newNode;
    }
    public void insertAt(int data, int pos){
        ListNode newNode = new ListNode(data);
        if (pos==1) {
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode previous = head;
            int count =1;
            while (count<pos-1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next= current;

        }
        
    }
    public ListNode deleteFirst(){
        if (head==null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteLast(){
        if (head==null || head.next==null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next!=null) {
            previous = current; 
            current = current.next;
        }
        previous.next = null;
        return current; 
    }
    public ListNode deleteAt(int pos){
        if (pos==1) {
            head = head.next;
            return head;
        }
        else{
            ListNode previous = head;
            ListNode current = previous.next;
            int count = 1;
            while (count<pos-1) {
                previous = current;
                current=current.next;
                count++;
            }
            previous.next=current.next;
            current.next=null;
            return head;
        }
    }
    public void search(int key){
        ListNode current = head;
        int count = 1;
        while (current.next != null) {
            if (current.data == key) {
                System.out.println("The element is available at: "+count);
            }
            current=current.next;
            if (current.next==null && current.data==key) {
                count++;
                System.out.println("The element is available at: "+count);
            }
            count++;
        }
    }
    public ListNode reverse(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public int nFromLast(int pos){
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < pos ) {
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr!=null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr.data;
    }


    //main method
    public static void main(String[] args) {
        //////making a linked list with 10->5->8->11->null
        linked_lst lst = new linked_lst();
        //data
        lst.head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        //linking all
        lst.head.next = second;
        second.next = third;
        third.next = fourth;

        //rest of the code
        lst.display();
        // lst.display();
        // lst.insertFirst(13);
        // lst.insertFirst(17);
        // lst.display();
        // lst.insertLast(9);
        // lst.display();
        // lst.insertAt(7, 1);
        // lst.display();
    
        
        System.out.println(lst.nFromLast(3));
    }
}
