// 크기가 5인 배열에 5개의 정수형 변수를 입력받아 출력하기
import java.util.Scanner;
public class test0112_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Scanner 선언
        int[] num = new int[5]; //크기가 5인 배열 선언

        for (int i = 0; i < num.length; i++) { //num의 길이만큼 irk wmdrkgka
            num[i] = sc.nextInt(); //정수형 배열 num에 값을 입력받음
            System.out.println("num[" + i + "] 에 입력된 숫자는 :" + num[i] + "입니다."
            ); // 입력받은 값을 출력
        }
    }
}
// 위 코드는 크기가 5인 정수(int)형 배열에 값을 입력받아 출력하는 코드입니다.
//각각 입력된 정수값이 배열에 저장되어 출력된다.
