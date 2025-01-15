public class VaisseauDeGuerre extends Vaisseau {

    boolean armesDesactivees;

//    Constructeur
    VaisseauDeGuerre(String type){
        this.type = type;

        if (type.equals("CHASSEUR")){
             tonnageMax = 0;
        } else if (type.equals("FREGATE")) {
            tonnageMax = 50;
        } else if (type.equals("CROISEUR")) {
            tonnageMax = 100;
        }


        /*switch (type) {
            case "CHASSEUR" -> tonnageMax = 0;
            case "FREGATE" -> tonnageMax = 50;
            case "CROISEUR" -> tonnageMax = 100;
        }*/
    }

    void attaque(Vaisseau vaisseauAttaquer, String armeUtilisee, int dureeAttaque){

        if (armesDesactivees){
            System.out.println("Attaque impossible l'armement est desactivé");
        }
        else {
            System.out.println("Un de type "+type +" attaque un vaisseau de type "+vaisseauAttaquer.type+
                    " en utilisateur l'arme "+armeUtilisee+" pendant "+dureeAttaque+" minutes.");
            vaisseauAttaquer.resistanceDuBouclier = 0;
            vaisseauAttaquer.blindage = vaisseauAttaquer.blindage/2;
        }

    }

    void desactiveArmes(){
        System.out.println("Désactivation des armes d'un vaisseau de type "+type);
        armesDesactivees = true;

    }

    @Override
    void activerBouclier()  {
        this.desactiveArmes();
        super.activerBouclier();
    }

//    La méthode rédefinir
    @Override
    int emporterCargaison(int cargaison) {
        if (type.equals("CHASSEUR")){
            return cargaison;
        } else if (nbPassagers < 12) {
            return cargaison;
        } else {
            int tonnagePassagers = 2 * nbPassagers;
            int tonnageRestant =  tonnageMax - tonnageActuel;
            int tonnageAConsiderer = (tonnagePassagers < tonnageRestant ? tonnagePassagers : tonnageRestant);

            if (cargaison > tonnageAConsiderer){
                tonnageActuel = tonnageMax;
                return cargaison - tonnageAConsiderer;
            }else {
                tonnageActuel = tonnageActuel + cargaison;
                return 0;
            }
        }
    }
}
