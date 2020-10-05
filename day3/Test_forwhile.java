
public class Test_forwhile {

	public static void main(String[] args) {

		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		
		//for:sum에 1부터 6까지 더하기
		for(int i = 1; i < 7; i++) {
			sum = i + sum;
		}
		//for:sum에 1부터 6까지 더하기
		for(int i = 1; i <= 6; i++) {
			sum = i + sum;
		}
		
		//for: sum에 1부터 100까지 더하기
		sum = 0;
		
		
		//for: sum에 1부터 20까지 2씩 더하기
		sum = 0;
		
		//for: sum에 1부터 100까지 더하기,
		//     단, sum이 85인 경우 빠져 나오기 : break
		sum = 0;
		for(int i = 1; i <= 100; i++) {

			if( sum == 45) 
				break;
			System.out.println(sum);
			sum = i + sum;
			
		}
		System.out.println("sum:" + sum);
		
		//
		sum = 0;
		int k = 0;
		for(k = 1; k <= 100; k++) {			
			sum = k + sum;
		}
		System.out.println("횟수: " + k + "번 만에 sum = " + sum);

		
		
		
		
		
		
		
		
		
	}

}
