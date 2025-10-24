import java.util.Arrays;

class SortSearch {
    int data[];
    int n;

    public SortSearch(int[] data) {
        this.data = data;
        this.n = data.length;
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
    public void insertionSort() {
        int z = 0;
        for (int i = 1; i < n; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;

            System.out.print("Lintasan " + (++z) + ": ");
            show();
        }
    }

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
