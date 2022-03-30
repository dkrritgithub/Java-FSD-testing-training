package encap1;

public class Stu {
	public static void main(String[] args) {
		Employee E = new Employee();
		E.setAccount_num(21283999);
		E.setFav_color("Black");
		E.setId(212839);
		E.setName("Keerthi Reddy");
		E.setSchool_name("ST.Marys High School");
		System.out.println("your account nu is"+ E.getAccount_num());
		System.out.println("your name is"+E.getName());
		System.out.println("your fav color is"+E.getFav_color());
		System.out.println("your id is"+E.getId());
		System.out.println(" your school"+E.getSchool_name());
	}
}

