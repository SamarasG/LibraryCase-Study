package LibraryCaseStudy;

public class Bookcopy implements Borrowable {

	private int id;
	private boolean available;
	private Book book;

	public Bookcopy(int id, Book book) {
		this.id = id;
		available = true;
		this.book = book;

	}

	public void borrowItem() {
		if (isAvailable() == true) {
			available = false;
		} else {
			System.out.println(toString() + "this bookcopy is not available to borrow");
		}
	}

	public void returnItem() {
		available = true;
	}

	// getters
	public int getId(int id) {
		return this.id;
	}

	public boolean isAvailable() {
		return available;
	}

	@Override
	public String toString() {
		return "Bookcopy [id=" + id + ", available=" + available + ", book=" + book + "]";
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public Book getBook() {
		return book;
	}
	

}
