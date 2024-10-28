public class MyLinkedList {
    
    public static class Node {
        int value;
        Node next;
        Node (int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is emply");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value); // giá trị của node hiện tại
                temp = temp.next;  // thao tác con trỏ next của node trỏ tới phần tử tiếp theo
                if(temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    // Chèn vào đầu list 
    public static Node addToHead(String prefix, Node headNode, int value) {
        System.out.println(prefix); // In ra thbao
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    // Chèn vào đuôi list
    public static Node addToTail(String prefix, Node headNode, int value) {
        System.out.println(prefix);
        Node newNode = new Node(value);
        if (headNode == null) { // Nếu list is empty, nút mới thành nút đàu tiên
            return newNode;
        } else {
            // B1. Đi xác định last node (Last node là node có lastNode.next = null)
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2. Gán next cho lastNode = new Node
            lastNode.next = newNode;
        }
        return headNode;
    }

    // Chèn vào một vị trí bất ký trong list (chèn giữa list)
    public static Node addToIndex(String prefix, Node headNode, int value, int index) {
        System.out.println(prefix);
        if (index == 0) { // -> gọi hàm addToHead để thêm vào đầu list
            return addToHead(prefix, headNode, value);
        } else {
            // B1. Tìm vị trí cần add
            Node newNode = new Node(value); // Tạ ra một new node
            Node currNode = headNode;  // tạo biên stham chiếu trỏ con trỏ tới node first
            int count = 0;
            while (currNode != null) {  // duyetj qua list ddeer timf vị trí cần thêm
                if(count == index - 1) {  // Tìm vị trí trước vị trí cần add
                    // thuc hien add
                    newNode.next = currNode.next; // Gán con tỏ của new node tới node tiếp theo của nút hiện tại
                    currNode.next = newNode; // Gán con trỏ của node hiện tại -> trỏ tới new node
                    break;
                }
                currNode = currNode.next;
                count++; 
            }
        }
        return headNode;
    }

    // Xóa phần tử đầu list
    public static Node removeAtHead(String prefix, Node headNode) {
        System.out.println(prefix);
        if(headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    // xóa phần tử ở đuôi list (cuối)
    public static Node removeAtTail(String prefix, Node headNode) {
        System.out.println(prefix);
        if(headNode == null) 
            return null;

        // B1. Xác định last và previous
        Node lastNode = headNode;
        Node preNode = null;
        while(lastNode.next != null) { // Nếu như lastnode là nút cuối cùng thì lastNode.next = null
            preNode = lastNode;
            lastNode = lastNode.next;
        }

        // B2. Next của proNode trỏ tới null
        if(preNode == null) {
            return null;
        } else {
            preNode.next = null;
        }
        return headNode; 
    }

    public static Node removeAtIndex(String prefix, Node headNode, int index) {
        System.out.println(prefix);
        if(headNode == null || index < 0) 
            return null;

            if (index == 0)
            return removeAtHead(prefix, headNode);

            Node currNode = headNode;
            Node preNode = null;
            int count = 0;

            while(currNode != null) {
                if (count == index) {
                    // Remove currNode
                    if (preNode != null) {
                        preNode.next = currNode.next;
                    }
                    break;
                }
                preNode = currNode;
                currNode = currNode.next;
                count++;
            }
            return headNode;
    }

    // ------------------Main--------------
    public static void main(String[] args) {
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        // Nối n1 -> n2 -> n3
        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        // printLinkedList(n2);
        // printLinkedList(n3);

        // Thêm vào đầu list
        n1 = addToHead("===Add to head===", n1, 0);
        printLinkedList(n1);

        // Thêm vào cuối list
        n1 = addToTail("===AddToTail===", n1, 0);
        printLinkedList(n1);

        // Thêm vào vị trí bất kỳ
        n1 = addToIndex("===AddToIndex===", n1, 0, 0);
        printLinkedList(n1);
        n1 = addToIndex("===AddToIndex===",n1, 4, 0);
        printLinkedList(n1);
        n1 = addToIndex("===AddToIndex===",n1, 1, 1);
        printLinkedList(n1);

        // Xóa phần tử đầu list
        n1 = removeAtHead("===Remove At Head===", n1);
        printLinkedList(n1);

        // Xóa phần tử cuối list
        n1 = removeAtTail("===Remove At Tail===", n1);
        printLinkedList(n1);

        // Xóa phần tử tại vị trí bất kỳ
        n1 = removeAtIndex("===Remove At Index===", n1, 0);
        printLinkedList(n1);
        n1 = removeAtIndex("===Remove At Index===",n1, 1);
        printLinkedList(n1);
    }
}
