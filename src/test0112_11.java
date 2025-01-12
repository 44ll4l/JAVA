// 문자열 배열을 선언하고 초기화하는 방법

//1. String[] myArray = {"value1", "value2", "value3"};
// 먼저 String[] 유형의 myArray 변수를 선언한다
//그런 다음 중괄호로 묶인 세 개의 문자열 값으로 배열을 초기화한다.
// 별도의 줄에서 문자열 배열 선언 및 초기화를 수행할 수 있다.

//2. String[] myArray;
//myArray = new String[] {"value1", "value2", "value3"};
//위 코드에서는 1번과 동일한 결과를 얻지마 선언과 초기화를 두 단계로 분리했다.
//또한 아래와 같이 크기만으로 배열을 초기화할 수도 있다.

//3. String[] myArray = new String[5];
//여기서는 문자열 배열을 만들고 문자열 배열 크기를 지정하지만 초기 값은 제공하지 않는다.
//그런다음 루프를 사용하거나 값을 개별적으로 지정하여 배열에 값을 할당할 수 있다.
//모든 경우에 변수를 선언하는 동안 배열 유형이(이 경우 String)을 지정해야 한다.

//문자열 배열을 반복하는 방법
//루프를 사용하여 배열을 반복할 수 있다.
//두 가지 유형의 루프를 모두 사용하는 예를 들어보겠다.

public class test0112_11 {
    public static void main(String[] args) {
        String[] stringArray = {"violin", "viola", "cello","double bass"};

        for (int i = 0; i < stringArray.length; i++) {
            String s = stringArray[i];
            System.out.print(s + " ");
        }
        System.out.println();


        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
// 먼저 4개의 요소가 있는 StringArray라는 문자열 배열을 만든다
// 그런 다음 두 루프 모두 문자열 배열의 각 요소를 반복하여 콘솔에 인쇄한다
// foreach 루프는 배열을 반복하는 것 보다 간결한 방법이지만
// 각 요소에 인덱스에 액세스 해야 하는 경우 for 루프가 유용할 수 있다.