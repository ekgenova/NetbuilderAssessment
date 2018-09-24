
public class Main {

	public static void main(String[] args) {
		
		Family fam = new Family();
		System.out.println(fam.setParent("Frank", "Morgan"));
		System.out.println(fam.setParent("Frank", "Dylan"));
		System.out.println(fam.male("Dylan"));
		System.out.println(fam.setParent("Joy", "Frank"));
		System.out.println(fam.male("Frank"));
		System.out.println(fam.male("Morgan"));
		System.out.println(fam.setParent("July", "Morgan"));
		System.out.println(fam.isMale("Joy"));
		System.out.println(fam.getChildren("Morgan"));
		System.out.println(fam.setParent("Jennifer", "Morgan"));
		System.out.println(fam.getChildren("Morgan"));
		System.out.println(fam.getChildren("Dylan"));
		System.out.println(fam.getParents("Frank"));
		System.out.println(fam.setParent("Morgan", "Frank"));
	}

}
