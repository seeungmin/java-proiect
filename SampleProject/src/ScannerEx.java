import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); // ���ڿ� �б�
		System.out.print("�̸��� " + name + ", ");
		String city = sc.next(); // ���ڿ� �б�
		System.out.print("���ô� " + city + ", ");
		int age = sc.nextInt(); // ���� �б�
		System.out.print("���̴� " + age + "��, ");
		double weight = sc.nextDouble(); // �Ǽ� �б�
		System.out.print("ü���� " + weight + "kg, ");
		boolean single = sc.nextBoolean(); // ���� �б�
		System.out.println("���� ���δ� " + single + "�Դϴ�.");
		sc.close(); // scanner �ݱ�
	}

}
