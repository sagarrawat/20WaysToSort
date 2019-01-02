package comparison;

public class InsertionSort {

    public static int[] sort(int ar[]) {

        for (int i = 1; i < ar.length; i++) {

            int key = ar[i];
            int j = i - 1;

            while (j >= 0 && ar[j] > key) {
                ar[j+1] = ar[j];
                --j;
            }
            ar[j+1] = key;
        }

        return ar;
    }

    public static void main(String args[]) {
        int ar[] = {5, 4, 2, 1, 3, 4, 7, 4, 2, 8, 10, 11, 2, 1};

        sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
