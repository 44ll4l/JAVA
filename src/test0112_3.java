import java.util.Scanner;
public class test0112_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.next();

        switch (ex) {
            case "a":
                System.out.println(" 해당 문자는 a 입니다."); //a
                break;
            case "b":
                System.out.println("해당 문자는 a 입니다."); //b
            case "c":
                System.out.println("해당 문자는 a 입니다."); //c
            default:
                System.out.println("입력값이 잘못되었습니다."); // 값이 잘못되었을 경우 기본
                break;
        }
    }
}
// switch문은 case별 조건을 선언한 후 해당 case의 구문을 수행한다.
//ex라는 변수에 문자열 값을 받은 후 해당 문자가 abc 세 가지에 속하는지 확인하고
//속하지 않는 다면 default문의 구문이 수행되며
//break문은 해당 조건문을 빠져나가게 해준다.