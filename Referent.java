
public class Referent {
	private String name, email, firma;
	
	public Referent (String n, String e, String f) {
		this.name = n;
		this.email = e;
		this.firma = f;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getFirma() {
		return firma;
	}
}
