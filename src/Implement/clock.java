package Implement;
// 거스름돈

import java.util.Scanner;

public class clock {
    public static boolean check(int h,int m,int s,int n){
        boolean ans = false;
        if(h/10 == n || h%10 ==n || m/10 == n || m%10 ==n || s/10 == n || s%10 ==n ){
            ans = true;
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int count=0;

        for(int h=0; h<=n; h++){
            for(int m=0; m<60; m++){
                for(int s=0; s<60; s++){
                    if(check(h,m,s,n)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}