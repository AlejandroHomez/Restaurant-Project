package models;

public class Client {
	
	//Attributes
	
	private String lastName;
	private String identityDocument;
	private String name;
	private boolean hasChildren;
	
	//Methods
	
	public Client(String name, String lastName, String identityDocument,  boolean hasChildren ) {	
		this.lastName = lastName;
		this.identityDocument = identityDocument;
		this.name = name;
		this.hasChildren = hasChildren;
	}
	
	//Gets
	
	public String getLastName() {
		return lastName;
	}
	
	public String getIdentityDocument () {
		return identityDocument;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getHasChildren() {
		return hasChildren;
	}
	
	
	//Sets
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public void setIdentityDocument (String identityDocument) {
		this.identityDocument = identityDocument;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setHasChildren (boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	
	@Override
	public String toString() {
		System.out.println("");
		return "Client[ *Nombre: " + name + " *Apellido: " +  lastName + " *ID: " + identityDocument + " *Tiene hijos: " + hasChildren+ " ]";
	}


}
