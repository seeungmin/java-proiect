import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month;                 // ���� �̸� ����
		int integer_Month = 0;        // ������ ���� ���� ���� �� 0���� �ʱ�ȭ

		System.out.printf("���� �̸��� �Է��Ͻÿ�:");
		month = sc.next();            // ���� �б�

		switch (month) {              // switch case ������ ����Ͽ� �Է¹��� ���� ����
		case "January":				  // ���� ������ ���Ӱ� �ʱ�ȭ
			integer_Month = 1;
			break;
		case "February":
			integer_Month = 2;
			break;
		case "March":
			integer_Month = 3;
			break;
		case "April":
			integer_Month = 4;
			break;
		case "May":
			integer_Month = 5;
			break;
		case "June":
			integer_Month = 6;
			break;
		case "July":
			integer_Month = 7;
			break;
		case "August":
			integer_Month = 8;
			break;
		case "September":
			integer_Month = 9;
			break;
		case "October":
			integer_Month = 10;
			break;
		case "November":
			integer_Month = 11;
			break;
		case "December":
			integer_Month = 12;
			break;
		default:
			System.out.println("�߸��� �� �̸��Դϴ�!!");     // �Է¹��� ���� �߸��Ǿ����� 
			sc.close();								   // �߸��Ǿ��ٰ� ��� �� ���α׷� ����
			return;
		}
		System.out.println(integer_Month + "�� �Դϴ�!!");  // ������ ����� �� ���

		sc.close();

	}

}
