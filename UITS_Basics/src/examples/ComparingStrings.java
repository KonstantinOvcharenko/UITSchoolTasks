package examples;

public class ComparingStrings {
	public static void main(String[] args) {
		String s1, s2;
		s1 = "Java";
		s2 = s1;

		System.out.println("��������� ������: " + (s1 == s2));
		s1 += '2';
		s2 = new String(s1);
		System.out.println("��������� ������: " + (s1 == s2));
		System.out.println("��������� ��������: " + s1.equals(s2));
	}
}