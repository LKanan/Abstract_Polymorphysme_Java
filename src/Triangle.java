public class Triangle extends Forme{
    private double base;
    private double hauteur;

    public Triangle() {
    }

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public Triangle(String nom, double base, double hauteur) {
        super.nom = nom;
        this.base = base;
        this.hauteur = hauteur;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    protected double Surface() {
        return this.base * this.hauteur / 2;
    }
}