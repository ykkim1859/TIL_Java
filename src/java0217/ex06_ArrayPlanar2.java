/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 2차원 배열 예제1
   version : 1.0
 */

package java0217;

import java.util.Scanner;

public class ex06_ArrayPlanar2 {

	public static void main(String[] args) {

		String words[][] = {
				{"chair","의자"},
				{"desk","책상"},
				{"coffee","커피"},
				{"pen","볼펜"},
				{"computer","컴퓨터"}
		};
		
		// words배열 크기 확인
		// words[5][2]
		System.out.println(words.length);
		System.out.println(words[0].length);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.println("문제" + (i+1)+". " + words[i][0] + "의 뜻?");
			String answer = sc.next();
			
			if(answer.equals(words[i][1])) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
				System.out.println("정답은 " + words[i][1] + "입니다");
			}
			
			// 출력하기 위한 j
			for(int j=0; j<words[i].length; j++) {
				// System.out.println("words["+i+"]["+j+"]=" + words[i][j]);
				
			}
			
			
		}

	}

}
