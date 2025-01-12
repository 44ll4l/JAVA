//문자열 배열을 문자열로 변환하는 방법
//String.join() 메서드를 사용하여 JAVA에서 문자열 배열을 문자열로 변환할 수 있다.
//이 메소드는 지정된 구분 기로호 연결된 문자열로 반환한다.
//구분 기호는 String Join() 메서드의 각 요소에 대해 복사된다.
//에는 다음과 같다.
public class test0112_15 {
    public static void main(String[] args) {
        String[] myArray = {"value1", "value2", "value3"};
        String joinedString = String.join(", ", myArray);
        System.out.println(joinedString);
    }
}
//세 개의 문자열 값을 사용하여 문자열 배열 myArray를 선언한다
//그 다음, String.join()메서드를 사용하여 모든 배열 요소를 단일 문자열로 결합한다.
//String.join()의 첫 번째 인수는 각 배열 요소 사이에 사용하려는 구분 기호이다.
//구분 기호로 ","(쉼표 뒤에 공백)을 사용했다.
//두 번째 인수는 조인하려는 배열이다.
//마지막으로 결과 문자열을 JoinString 변수에 할당하고 이를 콘솔에 인쇄한다.