import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k;//반복문 변수 k
		int num;//입력받을 숫자 변수
		int sum=0;//총 합 변수
		
		for(k=0;k<10;k++) {
			System.out.println("정수 입력:");
			num=scan.nextInt();
			
			if (num > 0 && num <= 100)//입력받은 정수들이 0보다 크고 100보다 작거나 같을 때
			{
				sum += num;//입력받은 정수들을 모두 더해준다.
			}

			else if (num <= 0 || num > 100)//입력받은 정수들이 0보다 작거나 같은 경우이거나 100보다 큰 경우
			{
				continue;//반복문을 지속한다.
			}
		}
		
		if (sum >= 1 && sum <= 1000) //1~100 범위 값들을 모두 더했을 때의 총합 범위
		{
			System.out.printf("1~100 범위 값들의 합:%d \n", sum);//1~100 범위 값들을 모두 더한 총합 출력
		}
		else if (sum <= 0 || sum >= 909)//1~100 범위 값 없이 그 외의 값들을 모두 더했을 때의 총합 범위
		{
			System.out.printf("입력하신 정수들이 모두 1~100 범위 값이 아닙니다. \n");//입력한 10개의 정수가 모두 1~100 범위 값이 아닌 경우 출력
		}


	}

}
