package exam01;

public class test05 {
//	2중 for문을 사용하여 아래의 결과를 출력하시오
//	1 2 3 4 5 6 7 8 9 10
//	2 3 4 5 6 7 8 9 10 1
//	3 4 5 6 7 8 9 10 1 2
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
		    for(int j = 1; j < 11; j++) {
		        if(i+j > 10) {
		            System.out.print(i+j-10);
		        }
		        else{
		            System.out.print(i+j);
		        }
		    }
		    System.out.println();

		}

	}
}
