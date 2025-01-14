public class VaisseauDeGuerre extends Vaisseau {

    boolean armesDesactivees;

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
}
