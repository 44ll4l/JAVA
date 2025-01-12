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
        String searchString1 = "cello";
        String searchString2 = "piano";
        search(stringArray, searchString1);
        search(stringArray, searchString2);

    }
}
