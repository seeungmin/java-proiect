import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month;                 // 월의 이름 선언
		int integer_Month = 0;        // 정수로 받을 월을 선언 및 0으로 초기화

		System.out.printf("월의 이름을 입력하시오:");
		month = sc.next();            // 정수 읽기

		switch (month) {              // switch case 구문을 사용하여 입력받은 월에 따라서
		case "January":				  // 월을 정수로 새롭게 초기화
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
			System.out.println("잘못된 월 이름입니다!!");     // 입력받은 월이 잘못되었으면 
			sc.close();								   // 잘못되었다고 출력 후 프로그램 종료
			return;
		}
		System.out.println(integer_Month + "월 입니다!!");  // 정수로 저장된 월 출력

		sc.close();

	}

}
