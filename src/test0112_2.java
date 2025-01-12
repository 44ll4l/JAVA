import java.util.Scanner; // 입력 스트림 사용을 위해 필요한 모듈을 불러온다.
public class test0112_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value= sc.nextInt();

        if(value >= 10) { // value가 10보다 클 경우
            System.out.println("입력받은 정수의 값은 :" + value + "입니다."); // value의 값을 출력

            System.out.println("너무 커!!");
        }
        else { // if문에 해당되는 조건이 아닌 그 외
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
// else문은 if문에 해당하지 않는 나머지에 해당되는 경우 수행된다.
// 즉 10보다 큰 경우가 아닌 10보다 작은 값이 입력되면 else문에 있는 메세지가 출력된다.