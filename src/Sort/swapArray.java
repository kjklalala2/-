package Sort;

import java.util.*;

public class swapArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int ch = input.nextInt();
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];

        for(int i=0; i<n; i++){
            A[i] = input.nextInt();
        }

        for(int i=0; i<n; i++){
            B[i] = input.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());

        for(int i=0; i<ch; i++){
            if(A[i]<B[i]){
                int temp = A[i];
                A[i] = B[i];
                B[i] = temp;
            }else{
                break;
            }
        }
        int result =0;
        for (int i = 0; i < n; i++) {
            result += A[i];
        }
        System.out.println(result);

    }
}