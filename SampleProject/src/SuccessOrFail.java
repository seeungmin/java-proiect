
import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = sc.nextInt();
		
		if(score>=80) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}
		else {
			System.out.println("�ƽ����� ���հ��Դϴ�.");
		}
		sc.close();
		
	}

}
