package codesquad_1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserAnswer {

	public ArrayList<Integer> userInput() {
		ArrayList<Integer> userList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println((i + 1) + "번째 숫자: ");
			int temp = scan.nextInt();
			while (userList.contains(temp) == true) {
				System.out.println("중복된 입력입니다. 다시 입력해주세요: ");
				temp = scan.nextInt();
			}
			
			userList.add(temp);

		}

		return userList;
	}

}
