
public class Workshop {
	private int nummer;
	private String bezeichnung, datum;
	private Referent referent;
	
	public Workshop (int n, String b, String d, Referent r) {
		this.nummer = n;
		this.bezeichnung = b;
		this.datum = d;
		this.referent = r;
	}
	
	public void anmelden (Teilnehmer t) {
		//tue Dinge
	}
	
	public void anmelden (Referent re) {
		//tue Dinge
	}

	public int getNummer() {
		return nummer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public String getDatum() {
		return datum;
	}
	
	public String getReferent() {
		return referent.getName();
	}

	//Daten können sich ggf. ändern
	public void setDatum(String datum) {
		this.datum = datum;
	}
}
