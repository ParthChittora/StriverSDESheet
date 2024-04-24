public class Sorting2dArrays {
    public static boolean isPresent(int[][]arr,int target){
        int r = arr.length;
        int c = arr[0].length;
        int s = 0 ;
        int e = r*c-1;
        while(s<=e){
            int midIndex = s+(e-s)/2;
            int rowIndex = midIndex/c;
            int colIndex = midIndex%c;
            int midEl = arr[rowIndex][colIndex];
            if(midEl==target){
                return true;
            }
            if(midEl<target) s = midIndex+1;
            else e = midIndex-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(isPresent(arr,13));
    }
}
