package exam01;

public class test07 {
//	10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//	1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
	public static void main(String[] args) {
		int result = 0;
		for(int i=1; i<1000; i++) {
			if(i%3==0 || i%5==0) {	//3or5
				result+=i;
				System.out.println("3or5의 배수: "+i); //맞는지 확인
			}
			
		}
		System.out.println("결과: "+result);
	}

}
