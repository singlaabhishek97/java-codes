class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int d) {
            data = d;
            next = null;
        }
    }
    public void DisplayLinkedList(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void InsertNode(int index, int data) {
        Node temp = new Node(data);
        Node prev = null, curr = head;
        for (int i = 0; i < index; i++) {
            if(curr == null)
                break;
            prev = curr;
            curr = curr.next;
        }
        if(prev == null){
            temp.next = head;
            head = temp;
        } else {
            prev.next = temp;
            temp.next = curr;
        }
    }
    public void DeleteNode(int index) {
        Node prev = null, curr = head;
        for (int i = 0; i < index; i++) {
            if(curr == null)
                break;
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        list.DisplayLinkedList();
        list.InsertNode(2,0);
        list.DisplayLinkedList();
        list.DeleteNode(2);
        list.DisplayLinkedList();
    }
}