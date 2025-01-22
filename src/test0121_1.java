/* Q. 윤년 */
/* desc. 조건을 보면 4의 배수는 1로 출력하지만 100의 배수일 경우 윤년이 아니라 0을 출력해야 한다.*/
/* desc. 다만, 400배의 배수일 경우는 윤년으로 본다. */
/* desc. 기본 알고리즘은 4의 배수인지 여부를 본뒤 4의 배구일 경우 400으로 나뉘어 떨어지는지, 100으로 나뉘어 떨어지는지 여부를 검사한다. */
// 1-1 단계 : 4의 배수일 경우 - if ( year%4==0 )
//    2-1 단계 : 4의 배수이면서 400의 배수일 경우 - if ( year%400 == 0 )
//    2-2 단계 : 4의 배수이면서 100의 배수일 경우 - else if ( year%100 == 0 )
//    2-3 단계 : 2단계 조건식 나머지 - else
//1-2 단계 : 1 단계 조건식 나머지 - else

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* check. 주의해야 할 것은 반드시 자료형 타입을 잘 보아야 한다. */
/* check. 문자열 형태로 저장된다. 즉, String으로 저장된다는 것이다.*/
/* check. 정수로 쓰기 위해 integer.parseint()로 int 형으로 변환시켜준다. */
public class test0121_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(br.readLine());

        if (y%4==0) {
            if (y%400==0) System.out.println("1");
            else if (y%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}
