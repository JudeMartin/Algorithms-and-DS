package DS.String;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("2");
		sb.append("->");
		sb.append("3");
		System.out.println(sb.toString());
		sb.delete(sb.length() - 3, sb.length());
		System.out.println(sb.toString());
		sb.append(2);
		System.out.println(sb.toString());
	}
}	
