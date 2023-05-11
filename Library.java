package LibraryCaseStudy;

import java.util.ArrayList;
import java.util.List;

;

public class Library {
	private List<Title> titles;
	private List<Member> members;
	private List<Borrowable> borrowables;

//methods: constructor
	public Library() {
		titles = new ArrayList<Title>();
		members = new ArrayList<Member>();
		borrowables = new ArrayList<Borrowable>();

	}

//add objects to Library (if element exist throw exception )
	public void addTitles(Title title) {
		titles.add(title);
	}

	public void addMember(Member member) {
		members.add(member);
	}

	public void addBorrowable(Borrowable borrowable) {
		borrowables.add(borrowable);
	}

	// remove objects from Library
	public void removeTitles(Title title) {
		titles.remove(title);
	}

	public void removeMember(Member member) {
		members.remove(member);
	}

	public void removeBorrowable(Borrowable borrowable) {
		borrowables.remove(borrowable);
	}

}
