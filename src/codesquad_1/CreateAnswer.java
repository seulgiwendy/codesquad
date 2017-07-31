package codesquad_1;

import java.util.ArrayList;
import java.util.Collections;

public class CreateAnswer {

	public ArrayList<Integer> numbers() {

		ArrayList<Integer> originalList = new ArrayList<Integer>();
		ArrayList<Integer> returnList = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			originalList.add(i);
		}

		Collections.shuffle(originalList);

		for (int i = 0; i < 3; i++) {
			returnList.add(originalList.get(i));

		}

		return returnList;
	}

}
