package Day6Assignment;

abstract class Google{
	abstract void search();
	abstract void show();
	void message() {
		System.out.println("Thanks for using google");
	}
}
class SearchAll extends Google{

	@Override
	void search() {
     System.out.println("searching all results");		
	}

	@Override
	void show() {
     System.out.println("showing all search results");		
	}
	
}
class SearchImage extends Google{

	@Override
	void search() {
      System.out.println("Image search results");		
	}

	@Override
	void show() {
      System.out.println("showing all search results");		
	}
	void message() {
		System.out.println("Thank for image search");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
        Google obj=new SearchAll();
        obj.message();
        obj.show();
        obj.search();
        Google obj1=new SearchImage();
        obj1.search();
        obj1.show();
        obj1.message();
        
	}

	}


