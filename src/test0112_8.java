// String.concat()
//concat 함수는 지정 문자열(String str)을 해당 문자열 끝에 연결하는 기능을 수행한다.
// 즉 문자열을 이어 붙일 때 사용되는 함수인데
// 이어 붙이려는 new string()을 통해 새로 할당받으므로
// 해당 문자열에 대한 주소 값을 새로 할당받습니다.

public class test0112_8 {
    public static void main(String[] args) {
        String s1 = new String("ㅎㅇ " );
        String s2 = "난 민주야";

        String r1 = s1.concat(s2);

        System.out.println(s1.concat(s2)); //String.concat()
        System.out.println(r1); // String.concat()
    }
}
// 역시 동일한 문자열 출력
// r1의 경우 concat()으로 이어지는 문자열을 새로 생성한 거라 상관없지만
// s1 자체에 concat을 사용해 s2를 붙여주는 경우에는
//concat()이 자체적으로 new string()을 통해 s2를 자체적으로 생성한다
// 그러므로 s1과 s2의 주소 값은 차이가 발생한다.