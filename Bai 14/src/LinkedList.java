public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Duyệt từng phần tử
    public void traverse() {
        if (head == null) {
            System.out.println("Empty list !!!");
            return;
        }

        Node<T> tmp = head;
        while (tmp != null) {
            // In phần tử
            System.out.println(tmp.getData()); // tự động toString
            tmp = tmp.getNext(); // chuyển đến phần tử tiếp theo
        }
    }

    // Thêm node mới vào đầu list
    public void addFirst(T item) {
        // Bước 1

        // C1:
        // Node<T> newNode = new Node<>(item, this.head);
        // C2:
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);

        // Bước 2
        this.head = newNode;
    }

    // Thêm node vào cuối Linkedlist
    public void addLast(T item) {
        if (head == null) {
            addFirst(item);
        } else {
            // Bước 1: Tạo newNode
            Node<T> newNode = new Node<>(item, null);
            // Bước 2: Duyệt từng node cho đến phần tử cuối cùng -> add newNode vào
            Node<T> tmp = head;
            while (tmp.getNext() != null) { // nếu mà tmp chư null
                tmp = tmp.getNext(); // Chạy cho đến khi nào ptu là null
            }
            tmp.setNext(newNode);
        }
    }

    // Thêm vào phía sau một node
    // key: Thêm phía sau ptu nào?
    // toInsert: cái giá trị phải thêm vào
    public void insertAfter(T key, T toInsert) {

        // Bước 2: Đi tìm vị trí của key
        Node<T> tmp = head;
        // Tìm node chứa key
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }
        // Tìm ra được node chứa key, or đi đến cuối l1

        // Thêm vào Khi tmp khác null
        if (tmp != null) {
            // 1: Tạo node mới
            // Node<T> newNode = new Node<>(); // tạo node rỗng
            // newNode.setData(toInsert);
            // 2
            // newNode.setNext(tmp.getNext());

            // 1 + 2
            Node<T> newNode = new Node<>(toInsert, tmp.getNext());
            // 3
            tmp.setNext(newNode);
        }
    }

    // Xóa 1 NODE
    public boolean remove(T key) {
        if (head == null) 
            return false;
    
        // Xóa key ở vị trí đầu tiên
        if (head.getData().equals(key)) {
            this.head = head.getNext();
            return true;
        }
    
        // Tạo biến tạm
        Node<T> prev = null;
        Node<T> cur = head;
    
        // Tìm vị trí node cần xóa
        while (cur != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }
    
        // Nếu không tìm thấy key
        if (cur == null) {
            return false;
        }
    
        // Xóa node và cập nhật liên kết
        prev.setNext(cur.getNext());
        return true;
    }

    public boolean idEmpty() {
        // if (head == null) {
        //     return true;
        // } else {
        //     return false;
        // }
           
        return head == null;          
    }

    public int size() {
        int count = 0;

        Node<T> tmp = head;
        while (tmp != null) {
            // Tang gia tri
            count++;
            tmp = tmp.getNext(); // chuyển đến phần tử tiếp theo
        }
        return count;
    }
    
    public boolean findItem(T item) {
        Node<T> tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

}
