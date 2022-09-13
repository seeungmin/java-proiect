import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month;
		int integer_Month = 0;

		System.out.printf("월의 이름을 입력하시오:");
		month = sc.next();

		switch (month) {
		case "January":
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
			System.out.println("잘못된 월 이름입니다!!");
			sc.close();
			return;
		}

		System.out.println(integer_Month + "월 입니다!!");

		sc.close();

	}

}
