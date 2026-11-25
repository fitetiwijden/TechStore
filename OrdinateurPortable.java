package TechStore;

public class OrdinateurPortable extends Ordinateur {

    private long capaciteBatterie;

    public OrdinateurPortable(
            String nom,
            double prix,
            double resolutionEcran,
            String processeur,
            long ram,
            SystemeExploitation systemeExploitaion,
            long disqueDur,
            String carteGraphique,
            long capaciteBatterie) {

        super(nom, prix, resolutionEcran, processeur,
              ram, systemeExploitaion, disqueDur, carteGraphique);

        this.capaciteBatterie = capaciteBatterie;
    }
    public long getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public void setCapaciteBatterie(long capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }
    @Override
    public String toString() {
        return super.toString() + ", capaciteBatterie=" + capaciteBatterie;
    }
    @Override
    public int garantirAppareil() {
        return 2;
    }
}