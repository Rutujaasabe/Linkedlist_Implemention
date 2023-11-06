package linkedList;

public class Node {

    public static int display(Node1 head) {
        // Node1 temp = head;
        int count = 0;
        while (head != null) {
            System.out.print(head.data + " ");
            count++;
            head = head.next;
        }
        return count;
    }

    public static class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
        }
    }

    public static void main(String rt[]) {
        Node1 x = new Node1(5); // head node
        Node1 y = new Node1(3);
        Node1 z = new Node1(2);
        Node1 a = new Node1(1);
        Node1 b = new Node1(9);
        x.next = y;
        y.next = z;
        z.next = a;
        a.next = b;
        System.out.println(z.next);
        System.out.println(a.next);
        display(x);
        System.out.println(" ");
        System.out.println(display(x));

        // Node1 temp = x;
        // for (int i = 1; i <= 4; i++) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

    }
}
