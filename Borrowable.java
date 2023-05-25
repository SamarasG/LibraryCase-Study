package LibraryCaseStudy;


public interface Borrowable {

	public void borrowItem()throws AvailabilityException;

	public void returnItem();

	public boolean isAvailable();

	public int getId();
}
