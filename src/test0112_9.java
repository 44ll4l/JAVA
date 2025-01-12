// StringBuilder Class
//StringBuilder 클래스 변수 s4를 생성해 ㅎㅇ 값을 넣은 후
//append()를 통해 JAVA 문자를 이어 붙여 출력하는 코드
public class test0112_9 {
    public static void main(String[] args) {
        StringBuilder s4 = new StringBuilder("ㅎㅇ ");
        s4.append("나는 민주");

        System.out.println(s4); //StringBuilder 주소값 변화가 없음
        // +연산은 성능 저하, 메모리 비효율 발생
        //StringBuilder 클래스를 통해 문자열을 합치는 게 좋음
        //비동기 대응 수월

        //StringBuilder나 StringBuffer는 초기에 생성할 때 Buffer Size를 주도록 구성되며 이에 의한 생성
        // 확장 오버로드가 발생하기 때문에 의외로 Buffer Size를 잘못 지정할 경우 성능이 떨어질 가능성도 있다.
        // 하지만 String 클래스의 경우 new에 의한 생성이 아닐 때 초기 컴파일러 분석 단계에서 literal 처리에 의해
        // 최적화가 될 수 있기 때문에 오히려 빠른 결과를 보여줄 때가 있다.
    }
}
