package comparison;

public class SelectionSort {

    public static int[] sort(int ar[]) {

        for (int i = 0; i < ar.length; i++) {
            int key = i;

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[key]) {
                    key = j;
                }
            }
            //swapping ar[i] and ar[j]
            int t = ar[i];
            ar[i] = ar[key];
            ar[key] = t;
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
