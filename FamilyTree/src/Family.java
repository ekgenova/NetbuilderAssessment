import java.util.ArrayList;

public class Family {
	
	private String name;
	private ArrayList<Person> members;
	private ArrayList<String> empty = new ArrayList<String>();
	
	public Family(String name) {
		this.name = name;
		members = new ArrayList<Person>();
	}
	
	private Person findFamMember(String name) {
		for (Person person: members) {
			if(person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}
	
	private void isFamMember(String name) {
		if (null == findFamMember(name)) {
			members.add(new Person(name));
		}
	}

	public boolean male(String name) {
		isFamMember(name);
		for (String child : findFamMember(name).getChildren() ) {
			for (String childParents : findFamMember(child).getParents()) {
				Person childParent = findFamMember(childParents);
				if (childParent.getName() != name) {
					if (childParent.getGender()=="male") {
						return false;
					} else if (childParent.getGender()=="") {
						childParent.setGender("female");
					}
				}
			}
		}
		return findFamMember(name).setGender("male");
	}

	public boolean female(String name) {
		isFamMember(name);
		for (String child : findFamMember(name).getChildren() ) {
			for (String childParents : findFamMember(child).getParents()) {
				Person childParent = findFamMember(childParents);
				if (childParent.getName() != name) {
					if (childParent.getGender()=="female") {
						return false;
					} else if (childParent.getGender()=="") {
						childParent.setGender("male");
					}
				}
			}
		}
		return findFamMember(name).setGender("female");
	}

	public boolean isMale(String name) {
		if (null != findFamMember(name)) {
			return (findFamMember(name).getGender() == "male") ? true : false;
		} else {
			return false;
		}
	}

	public boolean isFemale(String name) {
		if (null != findFamMember(name)) {
			return (findFamMember(name).getGender() == "female") ? true : false;
		} else {
			return false;
		}
	}

	public boolean setParent(String childName, String parentName) {
		isFamMember(childName);
		isFamMember(parentName);
		Person child = findFamMember(childName);
		Person parent = findFamMember(parentName);
		if(child.checkRelationship(parentName)) {
			if (child.getParents().size() == 1) {
				Person existingParent = findFamMember(child.getParents().get(0));
				if (existingParent.getGender()!= ""){
					if (existingParent.getGender() == parent.getGender()) {
						return false;
					} else {
						if(parent.getGender()=="") {
							if (existingParent.getGender()=="female") {
								parent.setGender("male");
								} else {
								parent.setGender("female");
								}
							parent.addChild(childName);
							return child.addParent(parentName);
							}
						else {
							parent.addChild(childName);
							return child.addParent(parentName);
						}
					}
				}
				else {
					parent.addChild(childName);
					return child.addParent(parentName);
				}
			}
			if (child.getParents().size() > 1) {
				return false;
			}
			parent.addChild(childName);
			return child.addParent(parentName);
		}
		return false;
	}

	public ArrayList<String> getParents(String name) {
		if (null == findFamMember(name)) {
			return empty;
		} else {
			return findFamMember(name).getParents();
		}
	}
	public ArrayList<String> getChildren(String name) {
		if (null == findFamMember(name)) {
			return empty;
		} else {
			return findFamMember(name).getChildren();
		}
	}

}
