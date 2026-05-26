public class checksort {
    public static boolean sortt(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        
        if(arr[idx] >= arr[idx + 1]){
            return false;
        }
        else{
            return sortt(arr, idx+1);
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 5};
        System.out.println(sortt(arr, 0));
    }
}
