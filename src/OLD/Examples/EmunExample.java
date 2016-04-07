package Examples;

public class EmunExample {
	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {
		for (Day day : Day.values()) {
			System.out.println("Printing from the ENUM: " + day);
		}
	}
}
/* enum - CVS -> */
/* Class.values() - to iterate to all the Enum values */
