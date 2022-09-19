import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // 
		int width, column;                     // 가로와 세로 선언
		double area, periphery;                // 넓이와 둘레 선언

		System.out.printf("사각형의 가로를 입력하시오:");	width = sc.nextInt();   //정수 읽기
		System.out.printf("사각형의 세로를 입력하시오:");	column = sc.nextInt();  //정수 읽기

		area = width * column;                 // 넓이 = 가로 * 세로 계산값으로 넓이 초기화
		periphery = 2 * (width + column);      // 둘레 = 2*(가로+세로) 계산값으로 둘레 초기화

		System.out.println("사각형의 넓이는 "+area);            // 넓이 출력
		System.out.println("사각형의 둘레는 "+periphery);       // 둘레 출력
		
		sc.close();
	}

}
