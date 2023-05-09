import java.util.*;

public class makeRiceCake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        // 원소의 개수(n)와 찾고자 하는 값(target)을 입력받기
        int n = sc.nextInt();

        // 전체 원소 입력받기
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr[arr.length-1];
        int result = 0;

        while(start <= end){
            long total=0;
            int mid = (start+end) / 2;

            for (int i = 0; i < m; i++) {
                if(arr[i]>mid){
                    total += arr[i]-mid;
                }
            }

            if(total<n){
                end = mid-1;
            }else{
                result = mid;
                start = mid+1;
            }
            System.out.println(end + " "+ start);
        }
        System.out.println(result);
    }
}

