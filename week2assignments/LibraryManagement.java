package week2.week2assignments;

public class LibraryManagement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Library lib = new Library();
		
		 String str = lib.addBook("Harry Potter");
		
		System.out.println(str);
		
		lib.issueBook();
	}

}
