package codesquad_1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserAnswer {

	public ArrayList<Integer> userInput() {
		ArrayList<Integer> userList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int attempt = 1;

		for (int i = 0; i < 3; i++) {
			System.out.println(attempt + "번째 시도입니다. \n 숫자를 입력해주세요. ");
			System.out.println((i + 1) + "번째 숫자");
			userList.add(scan.nextInt());

		}

		return userList;
	}

}
