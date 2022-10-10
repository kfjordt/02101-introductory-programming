
public class GradeConverter {

	public static int convert13to7(int grade) {
		if (grade == 13) {
			return 12;
		} else if (grade == 11) {
			return 12;
		} else if (grade == 10) {
			return 10;
		} else if (grade == 9) {
			return 7;
		} else if (grade == 8) {
			return 7;
		} else if (grade == 7) {
			return 4;
		} else if (grade == 6) {
			return 2;
		} else if (grade == 5) {
			return 0;
		} else if (grade == 3) {
			return 0;
		} else if (grade == 0) {
			return -3;
		} else {
			throw new IllegalArgumentException("Grade not in scale");
		}
	}
}
