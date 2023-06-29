import java.util.*;

class Bubble_Sort{
    public static void main(String[] args){
        

        int arr[]= {-32,21,-52,0,58,32,-49};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(Integer ele: arr) System.out.print(ele+" ");



    }
}