
import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {

    // Biết số lượng ptu trong stack và Vị trí tiếp theo 
    private int top; // vị trí của phần tử trên cùng
    private T[] stack; // Mảng để lưu trữ các phần tử
    private final int DEFAULT_CAPACITY = 100; // kthuoc mặc định

    // constructor mặc định
    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);

    }

    // constructor với kthuoc tùy chỉnh
    public ArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0");
        }
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    // hàm mở rộng kích thước stack đầy
    private void expandCapacity() {
        // 1 2 3 4 5 6
        // Tạo ra mảng mới có size gấp đôi
        T[] newStack = (T[]) (new Object[stack.length * 2]);  
        // _ _ _ _ _ _ _ _ _ _ _ _ 

        // Copy các phần tử từ mảng cũ sang mảng mới
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        // 1 2 3 4 5 6 _ _ _ _ _ _
        stack = newStack;
    }


    @Override
    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Không thể thêm giá trị null vào stack.");
        }
        if (top == stack.length) {
            expandCapacity();
        }
        stack[top++] = element;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw EmptyStackException if stack is empty
        }
        top--;
        T result = stack[top];
        stack[top] = null; // Remove the item at the top
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top-1]; // trả về ptu trên cùng mà ko thay đổi stack
    }

    @Override
    public boolean isEmpty() {     
        return this.top == 0; // Nếu top bằng 0 thì stack rỗng
    }

    @Override
    public int size() {       
        return this.top; 
        // quy định được trong stack đó có bao nhiêu ptu vì top là nằm trên cùng (LIFO)
    }

    
    
}
