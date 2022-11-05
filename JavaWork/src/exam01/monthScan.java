package exam01;

import java.util.Scanner;

public class monthScan {

	public static void main(String[] args) {
		System.out.println("몇월입니까?");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input){
		case 12:		//12, 1 , 2 입력 시 겨울 출력
		case 1:
		case 2:
			System.out.println(input +" 월은 겨울 입니다."); 
			break;
			
		case 3:			//3, 4, 5 입력 시 봄 출력
		case 4:
		case 5:
			System.out.println(input +" 월은 봄 입니다.");
			break;
			
		case 6:			//6, 7, 8 입력 시 여름 출력
		case 7:
		case 8:
			System.out.println(input +" 월은 여름 입니다.");
			break;
			
		case 9:			//9, 10, 11 입력 시 겨울 출력
		case 10:
		case 11:
			System.out.println(input +" 월은 가을입니다.");
			break;
		default:		//다른 값 이력시 다시 입력하라는 문구 출력
			System.out.println("다시 입력해주세요");
			break;
		}
		
	}

}
