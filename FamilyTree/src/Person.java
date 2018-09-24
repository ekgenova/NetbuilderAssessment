import java.util.ArrayList;

public class Person{
	
	private String name;
	private String gender;
	private ArrayList<String> parents;
	private ArrayList<String> children;
	
	public Person(String name) {
		this.name = name;
		this.gender = "";
		parents = new ArrayList<String>();
		children = new ArrayList<String>();
	}
	
	public Object getName() {
		return this.name;
	}
	
	public boolean setGender(String gender) {
		if (this.gender == "") {
			this.gender = gender;
			return true;
		} else {
			return false;
		}
	}

	public String getGender() {
		if (this.gender == "") {
			return "";
		} else {
			return this.gender;
		}
	}

	
	public boolean addParent(String parentName) {
		parents.add(parentName);
		return true;
	}
	
	public boolean addChild(String childName) {
		children.add(childName);
		return true;
	}

	
	public ArrayList<String> getParents() {
		return this.parents;
	}

	public ArrayList<String> getChildren() {
		return this.children;
	}
	
	public boolean checkRelationship(String name) {
		if (this.name == name) {return false;}
		if (parents.contains(name)) {return false;}
		if (children.contains(name)) {return false;}
		return true;
	}

}
