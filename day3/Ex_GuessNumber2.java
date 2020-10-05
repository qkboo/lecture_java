package verify;
import java.util.Scanner;
import java.util.Random;

public class Ex_GuessNumber2 {

	public static void main(String[] args) {

        int rndNumber, attempts;
        Random rand = new Random();
		Scanner scanner = new Scanner(System.in);


        //storing random number in randomInteger variable
		rndNumber = rand.nextInt(10)+1;
		attempts = 1;

		System.out.println("숫자 0 ~ 100 사이 숫자를 추측해 맞추세요");


        while(true){
            
            System.out.print("추측 숫자:");

            int guess = scanner.nextInt();

            //checking conditions and showing messages
            if(guess==rndNumber){
		        attempts += 1; 
		        System.out.print("맞았습니다.");
                break;
            }else if(guess>rndNumber){
		        System.out.print("숫자가 높아요!");
		        attempts += 1; 
            }else{
		        System.out.print("숫자가 낮아요!");
            }
        }
        
        System.out.print("시도횟수: " + attempts);

        
	}
}