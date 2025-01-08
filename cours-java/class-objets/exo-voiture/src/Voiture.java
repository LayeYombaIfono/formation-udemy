public class Voiture {
    int nbPortes = 5;
    boolean automatique;
    String color;
    int rapportCourant;
    int vitesse;
    Moteur moteur;
    static int nbRoues = 4;

    void klaxonner(){
        System.out.println("Pipiiiiiiiiiiiiiiiiii !");
    }

    int accelerer(){
        System.out.println("J'accélère");
        return 100;
    }

    int accelerer(int vitesse){
        System.out.println("J'accélère");
        this.vitesse=this.vitesse + vitesse;

        return vitesse;
    }

    int passerRapport(boolean augmenter ){
        if (augmenter){
            rapportCourant++;
        }else {
            rapportCourant--;
        }
        return rapportCourant;
    }

    void tourner(boolean droite, int angle){
        String droiteOuGauche;

        if (droite){
            droiteOuGauche = "Droite";
        }else {
            droiteOuGauche = "Gauche";
        }
        System.out.println("La voiture va tourner à "+droiteOuGauche+" dans un angle de " + angle+"°C");
    }

    Ville transporter(Passager passager, Ville villeDePart){
        System.out.println("Je transport le passager: "+ passager.nom+" "+passager.prenoms);
        System.out.println("Le passager est partir de la ville de "+villeDePart.nomDeLaVille);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nomDeLaVille = "Conakry";

        return villeDeDestination;

    }

}
