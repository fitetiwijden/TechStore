package TechStore;

public class OrdinateurDeBureau extends Ordinateur{
	private String alimentation;
	public OrdinateurDeBureau(
	        String nom,
	        double prix,
	        double resolutionEcran,
	        String processeur,
	        long ram,
	        SystemeExploitation systemeExploitaion,
	        long disqueDur,
	        String carteGraphique,
	        String alimentation) {

	    super(nom, prix, resolutionEcran, processeur,
	          ram, systemeExploitaion, disqueDur, carteGraphique);

	    this.alimentation = alimentation;
	}
	public String getAlimentation() {
	    return alimentation;
	}

	public void setAlimentation(String alimentation) {
	    this.alimentation = alimentation;
	}
	@Override
	public String toString() {
	    return super.toString() + ", alimentation=" + alimentation;
	}
	@Override
	public int garantirAppareil() {
	    return 1;
	}

}
