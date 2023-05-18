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
import java.util.List;

public class DummyProgram {

	public static void main(String[] args) {

		Member m = new Member(100, "Samaras");
		Journal j = new Journal(200, "Aartificial Inteligence", "Hermes");
		Book b = new Book(201, "1984", "George Orwell");

		System.out.println(m);
		System.out.println(j);
		System.out.println(b);

		AddTitleGUI gui = new AddTitleGUI();
		gui.setVisible(true);
		gui.pack();
	}

}
