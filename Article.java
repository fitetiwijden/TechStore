package TechStore;

public class Article {

    private int id;
    private String nom;
    private String reference;
    private double prix; 
    private static int compteur = 0;

    public Article(String nom, double prix) {
        this.id = ++compteur;
        this.nom = nom;
        this.prix = prix;
        this.reference = calculerReference(nom);
    }

    public int getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

   
    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setNom(String nom) {
        this.nom = nom;
        this.reference = calculerReference(nom);
    }

    public void setPrix(double prix) {
    
        this.prix = prix;
    }


    private String calculerReference(String nom) {

        String nomSansEspaces = nom.replace(" ", "");
        String resultat = "";

        for (int i = 0; i < nomSansEspaces.length(); i++) {

            if (i % 5 == 0) {
                resultat += nomSansEspaces.charAt(i);
            }
        }

        return resultat + id;
    }
    
}
