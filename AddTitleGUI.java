package LibraryCaseStudy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class AddTitleGUI extends JFrame implements ActionListener {

	private Library library;
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

		library = new Library();
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
		contentPanel.add(buttonsPanel, BorderLayout.SOUTH);
		buttonsPanel.add(addBookBt);
		addBookBt.addActionListener(n -> addBookButton());//Lambda function
		buttonsPanel.add(addJournalBt);
		addJournalBt.addActionListener(n -> addJournalButton());//Lambda function
		buttonsPanel.add(viewAllBt);
		viewAllBt.addActionListener(n -> viewAllButton());//Lambda function
		// fields container
		contentPanel.add(mainPanel, BorderLayout.CENTER);
		mainPanel.add(idLb);
		mainPanel.add(IdtF);
		mainPanel.add(titleLb);
		mainPanel.add(titleTf);
		mainPanel.add(authorEdLb);
		mainPanel.add(authorEdTf);

	}

	public void addBookButton() {
		
	}

	public void addJournalButton() {

	}

	public void viewAllButton() {

	}

	@Override
	public void actionPerformed(ActionEvent n) {
		// TODO Auto-generated method stub

	}
}
