public abstract class Vaisseau {
    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;

    void activerBouclier(){
        System.out.println("Activer du bouclier d'un vaisseau de type "+ type);
    }
    void desactiverBouclier(){
        System.out.println("Désactiver du bouclier d'un vaisseau de type "+ type);
    }

//    Méthode abstract
    abstract int emporterCargaison(int cargaison);
}
