package Greedy;
// 거스름돈

import java.util.Scanner;

public class chaneMoney {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();  //입력 돈
        int coidCount = 0; // 동전 갯수

        int[] coin = new int[] {500,100,50,10};

        for(int coinValue:coin){
            coidCount += money/coinValue;
            money = money%coinValue;
            if(money == 0) break;
        }
        System.out.println(coidCount);
    }
}
