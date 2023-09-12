public class Oops1 {
	int data = 40;
	String name = "xyz";

	class Inner {
		int age = 20;

		void println() {
			System.out.println("data " + data);
			System.out.println("name " + name);
			System.out.println("age " + age);

		}
		public static void main(String[] args)
		{
			String s="shashank";
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Oops1 o1 = new Oops1();
		Oops1.Inner i1 = o1.new Inner();
		i1.println();

	}

}
