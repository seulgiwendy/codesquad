package codesquad_1;

import java.util.ArrayList;

public class Simpan {
	public static int Strike(ArrayList ballList, ArrayList computerList) {

		int strike = 0;

		for (int i = 0; i < ballList.size(); i++) {
			if (ballList.get(i) == computerList.get(i)) {
				strike++;
			}
			;
		}

		return strike;
	}

	public static int Ball(ArrayList ballList, ArrayList computerList) {

		int ball = 0;

		for (int i = 0; i < ballList.size(); i++) {

			if (computerList.contains(ballList.get(i)) && ballList.get(i) != computerList.get(i)) {
				ball++;
			}
		}

		return ball;
	}

}
