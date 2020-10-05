package verify;
import java.util.Scanner;

public class  Ex_lecture {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("-------------------------------------");
		System.out.println("1.자바 | 2.C | 3.C++ | 4.Python");
		System.out.println("-------------------------------------");
		System.out.print("과목번호 : ");
		
		int menuNum = scanner.nextInt();
	
		if( menuNum == 1 ) {
			System.out.println("R101호 입니다.");
		} else if( menuNum == 2 ) {
			System.out.println("R202호 입니다.");
		} else if( menuNum == 3 ) {
			System.out.println("R303호 입니다.");
		} else if( menuNum == 4 ) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("다시 시작하세요.");				
		} 
		
		System.out.println();			
		System.out.println("프로그램 종료");
	}
}


