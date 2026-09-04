import java.util.HashSet;

public class intersection {
     public static int unions(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j = 0; j < arr2.length; j++){
            if(set.contains(arr2[j])){
                count++;
            }
            set.remove(arr2[j]);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {6,5,4};
        int[] arr2 = {6,7,8,4,5,6,1,2,3,9,0,5,4};

        System.out.println(unions(arr1, arr2));
    }
}
