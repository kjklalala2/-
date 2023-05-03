package Sort;
// 거스름돈

import java.util.Scanner;

public class selectSort {

    public static void temp(int[] arr,int i, int j){

        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


    public static void main(String[] args) {

        int[] arr = {7,5,9,0,3,16,2,4,8};

        for(int i=0; i<arr.length; i++){
            int small_index=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[small_index]){
                    small_index=j;
                }
            }
            temp(arr,i,small_index);
        }

        System.out.print(arr);
    }
}