public class Test {
    public static void main(String[] args) {
        StudentMS sms = new StudentMS();

        Student s1 = new Student("MS01", "Tran Van A", 20, 9.8f);
        Student s2 = new Student("MS02", "Le Thi B", 19, 6.8f);
        Student s3 = new Student("MS03", "Nguyen Van C", 18, 8f);
        Student s4 = new Student("MS04", "Hoang Van D", 25, 7f);

        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);
        sms.addStudent(s4);

        System.out.println("add element");
        sms.printList();

        System.out.println("\n===========================\n");
        Student s5 = new Student("MS05","Le Van F", 21, 7f);
        System.out.println("Kiem tra sinh vien co trong list khong? " + sms.findStudent(s5));

        System.out.println("\n===========================\n");
        
        // Student s6 = new Student("MS06","Nguyen Van X", 30, 8f);
        Student s6 = new Student("MS03","Nguyen Van X", 30, 8f);
        sms.update(s6);
        System.out.println("\nlist after update\n");
        sms.printList();

        Student s7 = new Student("MS07", "Nguyen Van X", 21, 7f);
        sms.addStudent(s7);

        System.out.println("\nSo sv .. X: " + sms.countStudent("Nguyen Van X\n"));

        // remove
        sms.remove(s2);
        sms.printList();
    }
}
