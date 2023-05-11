package LibraryCaseStudy;


public class Book extends Title {

	private String author;

	public Book(int id, String title, String author) {
		super(id, title);
		this.author = author;
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "Book [author=" + author + ", toString()=" + super.toString() + "]";
	}

}
