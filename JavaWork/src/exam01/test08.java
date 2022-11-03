package exam01;

import java.util.Scanner;

public class test08 {
//	A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 
//	공백으로 들여쓰기가 된 것들이 섞여 있다고 한다. A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 
//	수정한 후 납품할 예정이다.
//	A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 
//	프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요: ");
		String text = sc.nextLine();	//문장 입력
		
		String ReplaceResult = text.replaceAll("\t","    ");	//탭이 있을시 공백x4로 변환
		
		System.out.println("결과: "+ReplaceResult);
	}

}
