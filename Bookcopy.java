
public class Bookcopy extends Book implements Borrowable {

	private int id;
	private boolean available;

	public Bookcopy(int id, String title, String author) {
		super(id, title, author);
	}

	public void borrowItem() {
		setAvailable(false);
	}

	public void returnItem() {
		setAvailable(true);
	}

	public int getId(int id) {
		return this.id;
	}

	@Override
	public boolean isAvailable() {
		return false;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
