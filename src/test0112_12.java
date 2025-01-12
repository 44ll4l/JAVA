//배열에 새 요소를 추가하는 방법
//JAVA에서는 배열에 새 요소를 추가할 수 없다.
// 그러나 특별한 트릭이 있다.
//문자열 배열이 있고 배열 끝에 새 문자열을 추가해야 하는 경우 Array.copy0f 메서드 사용
//이 메서드는 하나의 추가 요소로 새 배열을 만든 다음 새 배열의 끝에 새 요소를 추가한다.

import java.sql.SQLOutput;
import java.util.Arrays;
public class test0112_12 {
    public static void main(String[] args) {
        String[] oldArray = {"violin", "viola", "cello"};
        String newElement = "double bass";
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[newArray.length -1] = newElement;

        for(String element : newArray){
            System.out.println("element = " + element);
        }
    }

}


