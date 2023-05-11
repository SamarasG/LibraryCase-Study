package LibraryCaseStudy;

import javax.swing.*;
import java.awt.*;

public class AddTitleGUI extends JFrame {

	private JPanel contentPanel;
	private JPanel mainPanel;
	private JPanel buttonsPanel;

	private JButton addBookBt;
	private JButton addJournalBt;
	private JButton viewAllBt;

	private JTextField IdtF;
	private JTextField titleTf;
	private JTextField authorEdTf;

	private JLabel idLb;
	private JLabel titleLb;
	private JLabel authorEdLb;

	AddTitleGUI() {
		this.setTitle("Add Tittle");
		contentPanel = (JPanel) this.getContentPane();
		mainPanel = new JPanel(new GridLayout(3, 2));
		buttonsPanel = new JPanel();
		// text fields
		IdtF = new JTextField();
		titleTf = new JTextField();
		authorEdTf = new JTextField();
		// buttons
		addBookBt = new JButton("Add Book");
		addJournalBt = new JButton("Add journal");
		viewAllBt = new JButton("View All");
		// labels
		idLb = new JLabel("ID:");
		titleLb = new JLabel("Title:");
		authorEdLb = new JLabel("Author/Editor:");

	}
}
