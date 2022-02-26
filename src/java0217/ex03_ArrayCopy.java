/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 배열 복사
   version : 1.0
 */

package java0217;

public class ex03_ArrayCopy {

	public static void main(String[] args) {
		String fire1[] = {"강병근","고윤섭","김가연","김유경","김준호"};
		String fire2[] = new String[5];
		
		System.arraycopy(fire1, 0, fire2, 0, fire1.length);
		// System.arraycopy(복사할배열명, 복사할배열index번호, 붙여넣을배열명, 붙여넣을배열index번호, 복사할배열크기)
		
		for(int i=0; i<fire1.length; i++) {
			System.out.println("fire1[" + i + "] = " + fire1[i]);
			
		}
		
		for(int i=0; i<fire2.length; i++) {
			System.out.println("fire2[" + i + "] = " + fire2[i]);
			
		}
		


	}

}
