import java.util.Scanner;
import searchAlgorithm.BinarySearch;
import searchAlgorithm.LinearSearch;
import sortAlgorithm.InsertionSort;
import sortAlgorithm.MergeSort;
import sortAlgorithm.QuickSort;
import sortAlgorithm.SelectionSort;


public class Main {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.println("Nhap so luong phan tu cua mang: ");
        int arrayLength = ip.nextInt();

        // Khởi tạo mảng
        int[] arrayInput = new int[arrayLength];

        // Nhập các phần tử của mẩng từ bàn phím
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Phan tu thu " + i + ": ");
            arrayInput[i] = ip.nextInt();
        }

        // Nhập giá trị cần tìm
        System.out.print("Nhap gia tri can tim: ");
        int key = ip.nextInt();

        callMeForBinarySearch(arrayInput, key);
        callMeForLinearSearch(arrayInput, key);
        
        // callMeForSelectionSort(arrayInput);
        callMeForInsertionSort(arrayInput);

        ip.close();
    }

    // LinearSearch
    static void callMeForLinearSearch(int[] arrayInput, int key) {
        int result = LinearSearch.linearSearch(arrayInput, key);
        if (result != -1) {
            System.out.println("Vi tri cua phan tu can tim la(Linear Search): " + result);
        } else {
            System.out.println("Gia tri " + key + " khong co trong mang(Linear Search)!!!");
        }
      
    }

    // BinarySearch
    static void callMeForBinarySearch(int[] arrayInput, int key) {
        int result = BinarySearch.binarySearch(arrayInput, key);
        if (result != -1) {
            System.out.println("Vi tri cua phan tu can tim la(Binary Search): " + result);
        } else {
            System.out.println("Gia tri: " + key + " khong co trong mang(Binary Search)!!!");
        }
    }

    // SelectionSort
    static void callMeForSelectionSort(int[] arrayInput) {
        SelectionSort selectionSortInstance = new SelectionSort();
        System.out.print("Mang truoc khi sap xep(Selection Sort): ");
        printArray(arrayInput);

        selectionSortInstance.selectionSort(arrayInput);
        System.out.print("Mang sau khi sap xep(Selection Sort): ");
        printArray(arrayInput);
    }

     // InsertionSort
    static void callMeForInsertionSort(int[] arrayInput) {
        InsertionSort insertionSortInstance = new InsertionSort();
        System.out.print("Mang truoc khi sap xep la(InsertionSort): ");
        printArray(arrayInput);

        insertionSortInstance.insertionSort(arrayInput);
        System.out.print("Mang sau khi sap xep tu be den lon(InsertionSort): ");
        printArray(arrayInput);

        // Sắp xếp từ lớn đến bé
        insertionSortInstance.reverseArray(arrayInput); // Sử dụng phương thức reverse
        System.out.print("Mang sau khi sap xep tu lon den be(reverseArray): ");
        printArray(arrayInput);
    }

    // QuickSort
    static void callMeForQuickSort(int[] arrayInput) {
        QuickSort quickSortInstance = new QuickSort();
        quickSortInstance.quickSort(arrayInput, 0, arrayInput.length - 1);
        System.out.println("mang sau khi sap xep tu be den lon(QuickSort): ");
        printArray(arrayInput);
    }

    // MergeSort
    static void callMeForMergeSort(int[] arrayInput) {
        MergeSort mergeSortInstance = new MergeSort();
        mergeSortInstance.mergeSort(arrayInput, 0, arrayInput.length - 1);
        System.out.println("Mang sau khi sap xep tu be den lon(MergeSort): ");
        printArray(arrayInput);
    }

    // Hàm in ra các phần tử trong mảng
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
