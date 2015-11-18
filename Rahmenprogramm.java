
public class Rahmenprogramm {
	private String bezeichnung, datum, zeit, ort;
 
	public Rahmenprogramm (String b, String d, String z, String o) {
		this.bezeichnung = b;
		this.datum = d;
		this.zeit = z;
		this.ort = o;
	}

	public void anmelden(Teilnehmer t) {
		//tu Dinge
	}
	
	public void anmelden(Referent r) {
		//tu Dinge
	}
	
	//Getter und Setter: Da sich Zeit und ort ändern können gibt es hierfür auch Setter
	public String getBezeichnung() {
		return bezeichnung;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getZeit() {
		return zeit;
	}

	public void setZeit(String zeit) {
		this.zeit = zeit;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
}
