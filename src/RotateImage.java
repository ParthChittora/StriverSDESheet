public class RotateImage {
    public static void swap(int[][] arr,int firstRow , int firstCol , int secondRow , int secondCol){
        int temp = arr[firstRow][firstCol];
        arr[firstRow][firstCol] = arr[secondRow][secondCol] ;
        arr[secondRow][secondCol]  =temp;
    }
    public static void printArray(int [][] arr){
        for (int [] el : arr) {
            for (int ele:
                 el) {
                System.out.print(ele+" ");
            }
            System.out.println("");
        }
    }
    public static void rotate(int[][] arr) {
        for (int i = 0; i <arr.length-i ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                swap(arr,i,j,arr.length-i-1,j);
            }
        }
        printArray(arr);
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr[0].length ; j++) {
                    swap(arr,i,j,j,i);
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[][]arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(arr);
    }
}
