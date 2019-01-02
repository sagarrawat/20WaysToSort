
package comparison;

public class BubbleSort {
    
    public static int[] sort (int ar[]){
        
        for (int i=0; i<ar.length; i++) {
            for (int j=i+1; j<ar.length; j++) {
                if (ar[j] < ar[i]) {
                    //swapping ar[i] and ar[j]
                    int t = ar[j];
                    ar[j] = ar[i];
                    ar[i] = t;
                }
            }
        }
        
        return ar;
    }
    
    public static void main (String args[]) {
        int ar[] = {5, 4, 2, 1, 3, 4, 7, 4, 2, 8, 10, 11, 2, 1};
        
        sort (ar);
        
        for (int i=0; i<ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
