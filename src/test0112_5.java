
//반복제어문 - while 문
// whileans gudxo
//while (조건식){
//              명령문;
//}
// while문의 형태는 조선식을 거친 후 바로 명령문이 수행된다.

// 무한반복문
// while(true) {
//          명령문;
//}
// 조건식에 true를 작성할 경우 무한루프(loop)문이 된다.
//무한반복문을 빠져나가기 위해 사용되는 명령어로는 break가 있다.

//break
import java.util.*;
public class test0112_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 값을 입력받을 sc 객체 생성
        while(true){
            System.out.println("값을 입력하시오 >>");
            int i=sc.nextInt(); //정수형 변수 i에 값을 입력받는다.
            if(i==0) break; //i의 값이 0이 되면 반복문을 벗어난다.
        }
    }
}
//정수형 변수 i에 값을 입력받아 0이 입력되면 반복문이 종료
// 그렇지 않으면 무한반복하는 코드이다.
//0이 입력되면 프로그램이 종료된다. (반복문을 탈출한다.)