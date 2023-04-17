
public class TextBlockExample {

	public static void main(String[] args) {

		String sName = "Amod Kunwar";
		String tbName = """
				Amod Kunwar""";
		System.out.println(sName.equals(tbName));
		System.out.println(sName == tbName);

		String s3 = """
				Amod : "How are you ?"
				""";
		System.out.println(s3);

		String s4 = """
				{
				 "name":"Amod",
				 "email":"amodkunwar@gmail.com"
				}
				""";
		System.out.println(s4);
	}

}
