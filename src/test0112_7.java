//JAVA의 String형 변수를 이어 붙이는 방법에는 대략 4가지 방법이 있다.
// String + String //+연산
// String.concat() // concat()함수를 이용한 문자열 이어 붙이기
// StringBuilder class // StringBuilder class를 통한 문자열 이어 붙이기
// StringBuffer class // StringBuffer를 통한 문자열 이어 붙이기
// 먼저 String + 연산을 통한 이어 붙이기를 알아보자

public class test0112_7 {
    public static void main(String[] args) {
        String s1 = new String("ㅎㅇ ");
        String s2 = "나는 민주야";
        String s3 = s1 + s2;

        System.out.println(s3);
        System.out.println(s1+s2); //결괏값 동일
    }
}
