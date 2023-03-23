
public class DummyProgram {

	public static void main(String[] args) {

		Member m = new Member(100, "Samaras");
		Journal j = new Journal(200, "Aartificial Inteligence", "Hermes");
		Book b = new Book(201, "1984", "George Orwell");

		System.out.println(m);
		System.out.println(j);
		System.out.println(b);
	}

}
