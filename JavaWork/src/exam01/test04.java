package exam01;

public class test04 {
//	1부터 100까지 반복하는 문장에서 3의 배수만 출력하시오
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}

	}

}
