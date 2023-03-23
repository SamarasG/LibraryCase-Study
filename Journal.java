
public class Journal extends Title {

	private String editor;

	public Journal(int id, String title, String editor) {
		super(id, title);
		this.editor = editor;
		// TODO Auto-generated constructor stub
	}

	public String getEditor() {
		return editor;
	}

	protected void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public String toString() {
		return "Journal [editor=" + editor + ", toString()=" + super.toString() + "]";
	}

}
