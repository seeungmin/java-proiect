import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, column;
		double area, periphery;

		System.out.printf("�簢���� ���θ� �Է��Ͻÿ�:");	width = sc.nextInt();
		System.out.printf("�簢���� ���θ� �Է��Ͻÿ�:");	column = sc.nextInt();

		area = width * column;
		periphery = 2 * (width + column);

		System.out.println("�簢���� ���̴� "+area);
		System.out.println("�簢���� �ѷ��� "+periphery);
		
		sc.close();
	}

}
