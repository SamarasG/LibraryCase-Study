package LibraryCaseStudy;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String name;
	public static final int MAX_ON_LOAN = 6;
	private List<Borrowable> onLoan;

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		onLoan = new ArrayList<Borrowable>();
	}

	public List<Borrowable> getOnLoan() {
		return onLoan;
	}

	public void setOnLoan(List<Borrowable> onLoan) {
		this.onLoan = onLoan;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMaxOnLoan() {
		return MAX_ON_LOAN;
	}

	// METHODS TO ASSOSIATE A BOOK WITH A MEMBER
	public void borrows(Borrowable b) throws AvailabilityException {
		// make exceptions for max 6 over and item not available
		onLoan.add(b);
		b.borrowItem();
	}

	// METHODS TO DIS-ASSOSIATE THE BOOK WITH THE MEMBER
	public void returns(Borrowable b) throws AvailabilityException {
		onLoan.remove(b);
		b.returnItem();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

}
