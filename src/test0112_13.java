//문자열 배열의 요소를 정렬하는 방법
//Array.sort() 메서드 사용
import java.util.Arrays;

    public class test0112_13 {
        public static void main(String[] args) {
            String[] stringArray = {"violin", "viola", "cello", "double bass"};


            Arrays.sort(stringArray);

            for (String s : stringArray) {
                System.out.print(s + " ");
            }
        }
}
// 먼저 4개의 요소가 있는 stringArray라는 배열을 만든다.
//Arrays.sort() 메서드를 호출하여 배열의 요소를 오름차순으로 정렬한다
//마지막으로 for-each 루프를 사용하여 정렬된 배열을 반복하고 각 요소를 콘솔에 인쇄한다.
// stringArray의 요소를 알파벳 순으로 정렬했다.