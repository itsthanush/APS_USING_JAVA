// Definition for singly-linked list.
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null; 
    }
}



public class ListCycle {
    static boolean hasCycle(Node head){
        if(head == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;   
    }

// Example usage  
public static void main(String[] args) {
        // Manually create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        
        // Manually link them
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Create cycle
        
        // Test
        System.out.println("Has cycle: " + hasCycle(node1));
    }
}
