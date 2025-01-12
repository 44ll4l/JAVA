// do while문 형태
//do{
//      명령문;
//}
//while(조건식);
// do/while문의 형태는 위와 같다.
// while문과 차이점은 while문은 조건에 부합하지 않는 경우 실행이 안 되는 경우가 있으나
//do/while문의 경우에는 무조건 한 번은 수행한다.
//즉 순서는 do-명령문-> while-조건식 순서이다.

import java.util.*;
public class test0112_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력 객체 생성
        int num;

        do {
            num = sc.nextInt(); //num에 정수값을 입력받음
        }while(num !=0); //num이 0이 아닌 경우에만 반복
    }
}
//위 코드는 do/while문에서 정수형 값(num)을 입력받아
//입력받은 값이 0이 아니라면 무한루프하는 구문이다.
//while문과 비슷하지만 다른 형태의 무한루프이다.