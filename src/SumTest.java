import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k;//�ݺ��� ���� k
		int num;//�Է¹��� ���� ����
		int sum=0;//�� �� ����
		
		for(k=0;k<10;k++) {
			System.out.println("���� �Է�:");
			num=scan.nextInt();
			
			if (num > 0 && num <= 100)//�Է¹��� �������� 0���� ũ�� 100���� �۰ų� ���� ��
			{
				sum += num;//�Է¹��� �������� ��� �����ش�.
			}

			else if (num <= 0 || num > 100)//�Է¹��� �������� 0���� �۰ų� ���� ����̰ų� 100���� ū ���
			{
				continue;//�ݺ����� �����Ѵ�.
			}
		}
		
		if (sum >= 1 && sum <= 1000) //1~100 ���� ������ ��� ������ ���� ���� ����
		{
			System.out.printf("1~100 ���� ������ ��:%d \n", sum);//1~100 ���� ������ ��� ���� ���� ���
		}
		else if (sum <= 0 || sum >= 909)//1~100 ���� �� ���� �� ���� ������ ��� ������ ���� ���� ����
		{
			System.out.printf("�Է��Ͻ� �������� ��� 1~100 ���� ���� �ƴմϴ�. \n");//�Է��� 10���� ������ ��� 1~100 ���� ���� �ƴ� ��� ���
		}


	}

}
