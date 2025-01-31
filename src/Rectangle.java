public class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle() {
    }
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Rectangle(String nom, double longueur, double largeur) {
        super.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    protected double Surface() {
        return this.longueur * this.largeur;
    }
}
