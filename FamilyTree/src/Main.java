
public class Main {

	public static void main(String[] args) {

		Family fam = new Family("Genova");
		System.out.println(fam.male("Stan"));
		System.out.println(fam.female("Kate"));
		System.out.println(fam.setParent("Kate", "Tony"));
		System.out.println(fam.setParent("Stan", "Tony"));
		System.out.println(fam.setParent("Tony", "Kate"));
		System.out.println(fam.female("Tony"));
		System.out.println(fam.setParent("Kate", "Bob"));
		System.out.println(fam.isMale("Bob"));
		System.out.println(fam.isFemale("Stan"));
		System.out.println(fam.isMale("Iva"));
		System.out.println(fam.getParents("Iva"));
		System.out.println(fam.getParents("Kate"));
		System.out.println(fam.getChildren("Tony"));
	}

}
