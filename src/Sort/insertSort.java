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

        for(int i=1; i<arr.length; i++){
           for(int j=i; j>0; j--){
               if(arr[j]<arr[j-1]){
                   temp(arr,j,j-1);
               }else{
                   break;
               }
           }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}