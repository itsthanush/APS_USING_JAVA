class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null; 
    }
}


public class Middle{
    static int middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }



// Example usage
public static void main(String[] args) {
        // Manually create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5= new Node(5);
        
        // Manually link them
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null; 
        
        
        System.out.println("Middle node: " + middleNode(node1));
    }
}