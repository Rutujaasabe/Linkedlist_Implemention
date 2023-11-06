package linkedList;

public class DoublyLinkedlist {
    public static class Node {
        int val;

        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            // System.out.println(temp.val + " ");
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x) {

        Node new_node = new Node(30);
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
        return head;

    }

    public static void insertAtEnd(Node head, int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAtIndex(Node head, int idx, int x) {
        Node temp = head;
        Node t = new Node(x);
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;

    }

    public static void main(String fg[]) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        // display(a);
        displayrev(e);
        // display2(c);
        // insertAtIndex(a, 3, 56);
        // Node newhead = insertAtHead(a, 30);
        // display(newhead);
        // insertAtEnd(a, 98);
        // display(a);
    }
}
