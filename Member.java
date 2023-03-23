
public class Member {
	private int id;
	private String name;
	public static final int MAX_ON_LOAN = 6;

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

}
