package exam01;

import java.util.Scanner;

public class BoardPaging {
//	A씨는 게시판 프로그램을 작성하고 있다.
//
//	A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
//
//	입력 : 총건수(total), 한페이지에 보여줄 게시물수(post) (단 n은 1보다 크거나 같다. n >= 1)
//	출력 : 총 페이지수 (page)
//
//	A씨가 필요한 프로그램을 작성하시오.
	public static void main(String[] args) {
		int total, post; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 건수: ");
		total = sc.nextInt();

		System.out.print("한 페이지에 보여줄 게시물수: ");
		post = sc.nextInt();
		
		if (total%post==0) {	// 게시물/게시물수 한 값이 일치할 경우
			System.out.printf("총 페이지: %d 페이지", total/post);
		}else {					// 게시물/게시물수 한 값이 일치하지 않을 경우
			System.out.printf("총 페이지: %d 페이지", (total/post)+1);
		}
	}

}
