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

	public void borrowItem() throws AvailabilityException {
		if (!available) {
			throw new AvailabilityException("BookCopy with id " + id + " is not available of book" + book.getId());

		}
		this.available = false;

	}

	public void returnItem() throws AvailabilityException {
		if (available) {
			throw new AvailabilityException(
					"BookCopy with id " + id + " of Book " + book.getId() + "was allready anvailable");
		}
		this.available = true;
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
