
public class Teilnehmer {
	private String name, email, a;
	private int status; //Zahl zwischen 0 und 2
	
	public Teilnehmer (String n, String e, int s) {
		this.name = n;
		this.email = e;
		this.status = s;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		if (status == 0) {
			a = "Student";
		}
		if (status == 1) {
			a = "Mitglied";
		}
		if (status == 2) {
			a = "Nichtmitglied";
		}
		return a;
	}
}
