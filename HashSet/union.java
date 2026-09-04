import java.util.HashSet;

class union {
    public static int unions(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        return set.size();
    }
    public static void main(String[] args) {
        int[] arr1 = {6,5,4};
        int[] arr2 = {6,7,8,4,5,6,1,2,3,9,0,5,4};

        System.out.println(unions(arr1, arr2));
    }
}