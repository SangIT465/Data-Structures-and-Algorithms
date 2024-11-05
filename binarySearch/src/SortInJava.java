import java.util.Arrays;

public class SortInJava {

    static class Student implements Comparable<Student> {
        private int age;
        private String name;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + "]";
        }

        @Override
        public int compareTo(Student otherStudent) {
            return Integer.compare(this.age, otherStudent.age);
        }
    }

    public static void main(String[] args) {
        // #1 Sort an integer array --> primary type
        int[] intArray = {3, 2, 1, 0};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // #2 Sort a string array --> object type
        String[] stringArray = {"1", "0000", "22"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        // #3 Sort array with interface Comparable
        Student[] students = {new Student("Nguyen Van A", 20), new Student("Le Van B", 10)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

    
}
