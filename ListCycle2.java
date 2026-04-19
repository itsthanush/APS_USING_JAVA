// Definition for singly-linked list.
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null; 
    }
}



public class ListCycle2{
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

    static Node detectCycle(Node head){
        if(head==null) return null;

        HashSet<Node> visited = new HashSet<>();
        Node current = head;
        while(current != null){
            if(visited.contains(current)){
                return current; 
            }
            visited.add(current);
            current=current.next;
        }
        return null;
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
        Node cycleStart = detectCycle(node1);
        if(cycleStart != null){
            System.out.println("Cycle starts at node with data: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected.");   
    }
}
} 