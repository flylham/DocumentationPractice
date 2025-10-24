import java.util.Arrays;

class SortSearch {
    int data[];
    int n;

    public SortSearch(int[] data) {
        this.data = data;
        this.n = data.length;
    }

    // =================== BUBBLE SORT ===================
    public void bubbleSort() {
        int z = 0;
        for (int i = n - 1; i > 0; i--) {
            System.out.print("Lintasan " + (++z) + ": ");
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            show();
        }
    }

    // =================== SELECTION SORT ===================
    public void selectionSort() {
        int z = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar elemen terkecil ke posisi i
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;

            System.out.print("Lintasan " + (++z) + ": ");
            show();
        }
    }

    // =================== INSERTION SORT ===================


    // =================== TAMPILKAN DATA ===================
    public void show() {
        System.out.println(Arrays.toString(data));
    }
}


// =================== MAIN PROGRAM ===================
public class Sorting {
    public static void main(String[] args) {
        int[] array = {70, 60, 50, 40, 30, 20, 25};

        System.out.println("Data Awal:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        // ===== SELECTION SORT =====
        int[] arrSelection = array.clone();
        System.out.println("=== PROSES SELECTION SORT ===");
        SortSearch ss1 = new SortSearch(arrSelection);
        ss1.selectionSort();
        System.out.println("Hasil Akhir Selection Sort:");
        ss1.show();
        System.out.println();

        // ===== INSERTION SORT =====
        int[] arrInsertion = array.clone();
        System.out.println("=== PROSES INSERTION SORT ===");
        SortSearch ss2 = new SortSearch(arrInsertion);
        ss2.insertionSort();
        System.out.println("Hasil Akhir Insertion Sort:");
        ss2.show();
    }
}
