package exam01;

public class test01 {
//	배, 사과, 오렌지를 키우고 있는데 각 과일의 하루 생산량은 각각 5, 6, 7개
//	1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력
//	2)시간당 과일의 생산 갯수를 출력

//	단, 과일의 갯수를 저장하는 변수는 int타입으로
//	하루에 생산되는 과일의 총 갯수를 저장하는 변수도 int타입으로
//	시간당 생산 갯수를 저장할 변수는 float타입으로 작성할 것.
	public static void main(String[] args) {
		int pear = 5;
		int apple = 6;
		int orange=7;
		
		int total = pear+apple+orange;
		float oneHour=total/24f;
		
		System.out.println(total);
		System.out.println(oneHour);
	}

}
