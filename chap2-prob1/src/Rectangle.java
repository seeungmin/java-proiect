import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, column;
		double area, periphery;

		System.out.printf("사각형의 가로를 입력하시오:");	width = sc.nextInt();
		System.out.printf("사각형의 세로를 입력하시오:");	column = sc.nextInt();

		area = width * column;
		periphery = 2 * (width + column);

		System.out.println("사각형의 넓이는 "+area);
		System.out.println("사각형의 둘레는 "+periphery);
		
		sc.close();
	}

}
