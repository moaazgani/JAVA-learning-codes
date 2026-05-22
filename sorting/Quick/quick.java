public class quick{
    public static int partition(int[] num, int low, int high){
        int pivot = num[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(num[j] <= pivot){
                i++;
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }

        i++;
        int temp = num[i];
        num[i] = pivot;
        num[high] = temp;
        return i;
    }
    public static void quicksort(int[] num, int low, int high){
        if(low<high){
            int pidx = partition(num, low, high);

            quicksort(num, low, pidx-1);
            quicksort(num, pidx+1, high);
        }
    }
    public static void main (String args[]){
        int[] num = {3, 5, 7, 8, 3, 5, 2, 3, 0, 1};
        int n = num.length;

        quicksort(num, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
// char alpha[] = {'s', 'g', 'a', 'r', 'z'};
// Arrays.sort(num);
// Arrays.sort(alpha);
// System.out.println(Arrays.toString(num));
// System.out.println(Arrays.toString(alpha));

