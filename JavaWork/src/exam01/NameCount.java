package exam01;

import java.util.ArrayList;

public class NameCount {
//	주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
//
//	이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
//
//	김씨와 이씨는 각각 몇 명 인가요?
//	"이재영"이란 이름이 몇 번 반복되나요?
//	중복을 제거한 이름을 출력하세요.
//	중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
	public static void main(String[] args) {
		String input=("이유덕,이재영,권종표,이재영,박민호,강상희,"
						+ "이재영,김지완,최승혁,이성연,박영서,박민호,"
						+ "전경헌,송정환,김재성,이유덕,전경헌");
		String[] names= input.split(",");
		int kim_count = 0;
		int lee_count = 0;
		int ljy_count = 0;
		ArrayList<String> name_list = new ArrayList<String>();

		
		for(int i=1; i<names.length; i++) {
			
			if(names[i].startsWith("김")) {
				kim_count ++;		//names에서 김씨만 카운트
			}
			if(names[i].startsWith("이")) {
				lee_count++; 		//names에서 이씨만 카운트
			}
			if(names[i].equals("이재영")) {
				ljy_count++;		//names에서 이재영씨만 추출
			}
			
		}
		System.out.println("김씨: "+ kim_count);
		System.out.println("이씨: "+ lee_count);
		System.out.println("이재영씨: "+ ljy_count);
		//중복제거 해야되고 오름차순 해야됨.
	}

}
