public class Bookcopy implements Borrowable {

	private int id;
	private boolean available;

	public Bookcopy(int id) {
		this.id = id;
		available = true;
	}

	public void borrowItem() {
		available=false;
	}

	public void returnItem() {
		available = true;
	}

	// getters
	public int getId(int id) {
		return this.id;
	}

	public boolean isAvailable() {
		return false;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
