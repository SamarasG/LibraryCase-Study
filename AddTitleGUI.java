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
		this.setTitle("Add 	New Tittle");
		// the panel
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
		// buttons container
		contentPanel.add(buttonsPanel,BorderLayout.SOUTH);
		buttonsPanel.add(addBookBt);
		buttonsPanel.add(addJournalBt);
		buttonsPanel.add(viewAllBt);
		// fields container
		contentPanel.add(mainPanel,BorderLayout.CENTER);
		mainPanel.add(idLb);
		mainPanel.add(IdtF);
		mainPanel.add(titleLb);
		mainPanel.add(titleTf);
		mainPanel.add(authorEdLb);
		mainPanel.add(authorEdTf);

	}
}
