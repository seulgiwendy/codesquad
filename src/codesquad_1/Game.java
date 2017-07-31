package codesquad_1;

import java.util.ArrayList;

public class Game {

	public static void setGame() {

		int strike, ball;
		ArrayList<Integer> userInput = new ArrayList<Integer>();
		ArrayList<Integer> computerInput = new ArrayList<Integer>();
		CreateAnswer ca = new CreateAnswer();
		UserAnswer ui = new UserAnswer();
		computerInput = ca.numbers();

		while (true) {
			userInput = ui.userInput();

			strike = Simpan.Strike(userInput, computerInput);
			ball = Simpan.Ball(userInput, computerInput);

			if (strike == 3) {
				System.out.println("정답을 맞추셨습니다.");
				break;
			}
			
			System.out.println("볼 카운트는 " + ball + "B " + strike + "S 입니다.");
		}

	}

}
