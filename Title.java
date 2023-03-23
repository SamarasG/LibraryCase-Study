
public class Title {

	private int id;
	private String title;

	public Title(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Title [id=" + id + ", title=" + title + "]";
	}

}
