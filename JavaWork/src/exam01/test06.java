package exam01;

public class test06 {
//	2중 for문을 사용하여 아래의 결과를 출력하시오
//	          *
//	        * * *
//	      * * * * *
//	    * * * * * * *
//	  * * * * * * * * *	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {   //1,2,3,4
		    for(int j = 0; j < i+5; j++) { //1,2 
		        if(i + j > 3) { 		
		        	System.out.printf("* ");
		        }else {
		        	System.out.printf("  ");
		        }
		    }
			System.out.println();
		}
	}
}
