import java.util.HashSet;

import org.w3c.dom.Node;

public class day56 {
    

    public static Node findIntersection(Node head1, Node head2)
    {
        Node dummy = new Node(0); // dummy node to simplify code
        Node current = dummy;
        
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                current.next = new Node(head1.data);
                current = current.next;
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data < head2.data) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }
        
        return dummy.next; // head of the intersection list
    }
   

}
