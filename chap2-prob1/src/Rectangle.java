import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // 
		int width, column;                     // ���ο� ���� ����
		double area, periphery;                // ���̿� �ѷ� ����

		System.out.printf("�簢���� ���θ� �Է��Ͻÿ�:");	width = sc.nextInt();   //���� �б�
		System.out.printf("�簢���� ���θ� �Է��Ͻÿ�:");	column = sc.nextInt();  //���� �б�

		area = width * column;                 // ���� = ���� * ���� ��갪���� ���� �ʱ�ȭ
		periphery = 2 * (width + column);      // �ѷ� = 2*(����+����) ��갪���� �ѷ� �ʱ�ȭ

		System.out.println("�簢���� ���̴� "+area);            // ���� ���
		System.out.println("�簢���� �ѷ��� "+periphery);       // �ѷ� ���
		
		sc.close();
	}

}
