public class Voiture {
    int nbPortes = 5;
    boolean automatique;
    String color;
    int rapportCourant;


    void klaxonner(){
        System.out.println("Pipiiiiiiiiiiiiiiiiii !");
    }

    int accelerer(){
        System.out.println("J'accélère");
        return 100;
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



}
