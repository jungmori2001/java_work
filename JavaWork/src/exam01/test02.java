package exam01;

public class test02 {
//	변수 n에 정수값을 저장하고 1부터 입력받은 정수 n까지의 합을 계산하여 
//	그 결과를 출력하는 프로그램을 작성.
//	예를들어 정수 5를 입력받으면, 
//	1 + 2 + 3 + 4 + 5의 연산결과인 15를 출력해야 한다.
	public static void main(String[] args) {
		int result = 0;
		int n = 5;
		for(int i=1; i<=n; i++) {
			result +=i;
		}
		System.out.println("결과: "+result);
	}

}
