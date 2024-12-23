public interface StackADT<T> {
    
    // Thêm một phần tử và đỉnh stack (push)
    public void push (T element);

    // Trả về và loại bỏ phần tử ở đỉnh stack (pop)
    public T pop();

    // Trả về nhưng không loại bỏ phần tử (peek)
    public T peek();

    // Kiểm tra stack rỗng hay không
    public boolean isEmpty();

    // Lấy số lượng phần tử
    public int size();

    // Lấy ra chuỗi của các phần tử
    public String toString();
    
}
