//StringBuffer
//단일 문자열 생성은 String 클래스로 생성하는 게 맞지만
// 문자열을 이어 붙이는 동작 구현 시에는 StringBuilder, StringBuffer class를 이용하는 게 좋다
// 이유인 즉 성능 저하 및 메모리 비효율 이슈가 발생하기 때문
public class test0112_10 {
    public static void main(String[] args) {
        StringBuffer s5 = new StringBuffer("ㅎㅇ염 ");
        s5.append("난 민주");

        System.out.println(s5); //StringBuffer
        //+연산은 성능 저하, 메모리 비효율 발생
        //StringBuilder 클래스를 통해 문자열을 합치는 게 좋음
        //StringBuffer class 역시 Builder class와 동일하게 append로 문자열을 이어 붙일 수 있다.
        //+,concat()의 이어 붙이기 보다 Buffer와 Builder의 이어 붙이기 연산이 효율적이고 비동기 대응에도 수월하다
        // 위 코드로 동일하게 "ㅎㅇ 난 민주야'" 문자열이 출력된다.
    }
}
