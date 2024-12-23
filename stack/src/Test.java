public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(15);
        stack.push(10);
        stack.push(5);
        // 15 10 5

        // Lấy phần tử ra bằng pop
        if (!stack.isEmpty()) {
            int x = stack.pop();
            System.out.println(x); // => 5
        } else {
            System.out.println("Stack rỗng, không thể pop.");
        }

        // Lấy phần tử trên cùng bằng peek
        if (!stack.isEmpty()) {
            int y = stack.peek();
            System.out.println(y); // => 10
        } else {
            System.out.println("Stack rỗng, không thể peek.");
        }

        // Lấy phần tử ra tiếp bằng pop
        if (!stack.isEmpty()) {
            int z = stack.pop();
            System.out.println(z); // => 10
        } else {
            System.out.println("Stack rỗng, không thể pop.");
        }
    }
}
