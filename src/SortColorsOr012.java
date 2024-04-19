import java.util.Arrays;

public class SortColorsOr012 {
    public static void sortColors(int[] arr) {
        // Naive Approach : Sort the array
        // Finding the freq of every element then updating the array accordingly
//        int[] freq = new int[3];
//        for (int el:arr) {
//            switch (el){
//                case 0: freq[0]++; break;
//                case 1: freq[1]++; break;
//                case 2: freq[2]++; break;
//            }
//        }
//        int i=0,j=0;
//        while(i<3){
//            while(freq[i]!=0){
//                arr[j++]=i;
//                freq[i]--;
//            }i++;
//        }
        // Best Approach : Dutch Flag theorem
        int s = 0;
        int m = 0;
        int h = arr.length - 1;
        while (m <= h) {
            switch (arr[m]) {
                case 0: swap(arr,s,m);m++;s++;break;
                case 1: m++;break;
                case 2: swap(arr,h,m);h--;break;
            }
        }
    }
    public static void swap(int[] arr ,int a , int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b] =temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
