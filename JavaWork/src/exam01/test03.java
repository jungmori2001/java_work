package exam01;

public class test03 {
//	변수 n1과 n2에 값을 넣고 n1과 n2사이의 합을 계산하여 그 결과를 출력하는 프로그램을 작성.
//	예를들어 2와 5를 입력받으면, 2 + 3 + 4 + 5의 연산결과인 14를 출력해야 한다.
//	단, 5와 2 처럼 큰 수를 먼저 입력받아도 같은 결과가 나와야 함
	public static void main(String[] args) {
		int result = 0;
		int n2 = 5;
		
		for(int n1=2; n1<=n2; n1++) {
			result+=n1;
		}
		System.out.println("결과: "+result);
	}

}
