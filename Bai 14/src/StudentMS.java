public class StudentMS {
    private LinkedList<Student> list;

    public StudentMS() {
        this.list = new LinkedList<Student>();
    }

    public void addStudent(Student student) {
        this.list.addLast(student);
    }

    public void printList() {
        this.list.traverse();
    }

    // Tìm svien có trong list 0?
    public boolean findStudent(Student student) {
        return list.findItem(student);      
    }

    public void update(Student student) {
        Node<Student> tmp = list.getHead(); // tạo biến 'tmp' để giữ first node của list
        while (tmp != null) { // duyệt đến khi tmp thành null
            Student st = tmp.getData();
            if(st.getId().equals(student.getId())) { // ktra id của obj Student hiện tại có trùng với id của student truyền vào 0?
                st.setFullName(student.getFullName()); // update fullName
                st.setAge(student.getAge());        // uodate Age
                st.setGpa(student.getGpa());
            } else {
                System.out.println("No element found to update");
            }
            tmp = tmp.getNext(); // sau ktra và update cho node hiện tại, sẽ chuyển sangnode tiếp theo đến khi null
        }
    }

    public void remove(Student student) {
        this.list.remove(student);
    }

    public int countStudent(String fullName) {
        int count = 0;
        Node<Student> tmp = list.getHead();
        while(tmp != null) {
            Student st = tmp.getData();
            if(st.getFullName().equals(fullName)) {
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }
}
