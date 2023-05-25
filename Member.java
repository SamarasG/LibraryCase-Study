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
	public void borrows(Borrowable b) throws AvailabilityException, LoanLimitException {
		// make exceptions for max 6 over and item not available
		if (onLoan.size() == MAX_ON_LOAN) {
			throw new LoanLimitException("Member" + name + " with name" + id + "can not borrow " + b.getId()
					+ "because they have max number of items on loan");
		}
		onLoan.add(b);
		b.borrowItem();
	}

	// METHODS TO DIS-ASSOSIATE THE BOOK WITH THE MEMBER
	public void returns(Borrowable b) throws AvailabilityException,CannotBeReturnedByMemberException {
		if(!onLoan.contains(b)) {
			throw new CannotBeReturnedByMemberException("Member"+name+" with name" +id+"can not return "+b.getId()+"because they dont  have this item"+b.getId()+" on loan");
		}
		onLoan.remove(b);
		b.returnItem();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

}
