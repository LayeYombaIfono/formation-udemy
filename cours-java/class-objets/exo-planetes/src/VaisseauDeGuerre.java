public class VaisseauDeGuerre extends Vaisseau {

    void attaque(Vaisseau vaisseauAttaquer, String armeUtilisee, int dureeAttaque){
        System.out.println("Un de type "+type +" attaque un vaisseau de type "+vaisseauAttaquer.type+
                " en utilisateur l'arme "+armeUtilisee+" pendant "+dureeAttaque+" minutes.");

        vaisseauAttaquer.resistanceDuBouclier = 0;
        vaisseauAttaquer.blindage = vaisseauAttaquer.blindage/2;
    }
}
