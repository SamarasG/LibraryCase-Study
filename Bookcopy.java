public class Bookcopy implements Borrowable {

	private int id;
	private boolean available;

	public Bookcopy(int id) {
		this.id = id;
		available = true;
	}

	public void borrowItem() {
		if (Bookcopy().available = true) {
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
		return false;
	}

	@Override
	public String toString() {
		return "Bookcopy [id=" + id + ", available=" + available + "]";
	}
	//
}
