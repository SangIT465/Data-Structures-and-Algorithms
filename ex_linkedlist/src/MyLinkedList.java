public class MyLinkedList {

    // Tạo node
    public static class Node {
        int value;
        Node next; // để trỏ tới Node tiếp theo của nó

        Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public static void printLinkedList(Node head) {
        // Kiểm tra list rỗng
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next; // node trước trỏ đến node sau
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }   
    }

     // Thêm phần tử vào đầu list
    public static Node addToHead(String prefix, Node headNode, int value) {
        System.out.println("\nAdd to head");
        
        Node newNode = new Node(value);

        if(headNode != null) {
            newNode.next = headNode;
        }
        return newNode;    
    }

    // Thêm vào cuối list
    public static Node addToTall(Node headNode, int value) {
        Node newNode = new Node(value);

        if (headNode == null) {
            return newNode;
        } else {
            // B1. xác định Last Node (lastNode.next = NULL)
            Node lastNode = headNode;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2. gắn next cho lastNode = new Node
            lastNode.next = newNode;
        }
        return newNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1); // Node có giá trị là '1'
        Node n2= new Node(2);
        Node n3 = new Node(3);

        n1.next = n2; // n1 trỏ đến n2
        n2.next = n3; // n2 trỏ đến n3
        
        printLinkedList(n1); 
        // printLinkedList(n2);
        // printLinkedList(n3);

        n1 = addToHead("",n1, 0);
        printLinkedList(n1);

        printLinkedList(n1);
    }

}