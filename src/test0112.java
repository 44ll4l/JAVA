import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.Scanner; // 입력 스트림 사용을 위해 필요한 모듈을 불러온다.
public class test0112 {
    public static void main(String[] args) { //main

        Scanner sc=new Scanner(System.in); // sc객체를 생성한다.
        int  value= sc.nextInt(); // 정수형 변수 value에 값을 입력받는다.

        if(value>= 10) { // value가 10보다 클 경우
            System.out.println("입력받은 정수의 값은 : "+value+"입니다.");
            //value의 값을 출력
            System.out.println("너무 커!!");
        }
    }
}