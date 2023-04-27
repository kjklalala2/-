package FS;
// 거스름돈

import java.util.Scanner;

public class makeIce {

    public static int n;
    public static int m;
    public static int[][] data = new int[1000][1000];

    public static boolean check(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >=n || y <= -1 || y >= m) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (data[x][y] == 0) {
            // 해당 노드 방문 처리
            data[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            check(x - 1, y);
            check(x, y - 1);
            check(x + 1, y);
            check(x, y + 1);
            return true;
        }
        return false;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        // N을 입력받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            for(int j=0; j<m; j++){
                data[i][j] = str.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(check(i,j)){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}