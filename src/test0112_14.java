//문자열 배열에서 특정 문자열을 검색하는 방법
//JAVA의 문자열에서 필요한 문자열을 검색하려면 루프를 사용하여 배열 요소를 반복하고 검색 중인 문자열 과 비교할 수 있다.

public class test0112_14 {
    public static boolean search(String[] myArray, String myString) {
        boolean found = false;

        for (String s : myArray) {
            if (s.equals((myString))) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(myString + "found in the array.");
        } else {
            System.out.println(myString + "not found in the array.");
        }
        return found;
    }

    public static void main(String[] args) {
        String[] stringArray = {"violin", "viola", "cello", "double bass"};
        String searchString1 = "cello ";
        String searchString2 = "piano ";
        search(stringArray, searchString1);
        search(stringArray, searchString2);

    }
}
//찾을 문자열과 배열이라는 두 개의 인수를 사용하여 메서드를 만든다
// String을 찾았는지 추적하기 위해 부울 'found'를 생성
// 메소드가 반환할 발견된 값이다.
// 그 다음, for-each 루프를 사용하여 각 배열 요소를 반복한다.
// 루프에서 equals(0 메소드를 사용하여 현재 요소를 검색 문자열과 비교한다.
//메서드가 일치하는 항목을 찾으면 이를 true로 설정하고 break 문을 사용하여 루프를 조기에 종료한다.
//마지막으로 찾은 내용이 참인지 거짓인지에 따라 결과를 인쇄한다.
// 기본 메서드에서는 배열에 있는 문자열과 그렇지 않은 문자열을 사용하여 검색 메소드를 두 번 호출한다.
