public class Planet {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs=0;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;
    static String forme = "Sphérique";


    int  revolution(int angle){

        return angle/360;

    }

   int  rotation(int angle){
       return angle/360;
    }

    void accueillirVaisseau(Vaisseau vaisseau){
        totalVisiteurs = totalVisiteurs + vaisseau.nbPassagers;

        if (vaisseauActuellementAcoste==null){
            System.out.println(" Aucun vaisseau ne s'en va");
        }
        else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.type +" doit s'en aller");
        }
        vaisseauActuellementAcoste = vaisseau;
    }

    /*
    void accueillirVaisseau(String typeVerseau){

        switch (typeVerseau) {
            case "CHASSEUR" -> totalVisiteurs = totalVisiteurs + 3;
            case "FREGATE" -> totalVisiteurs = totalVisiteurs + 12;
            case "CROISEUR" -> totalVisiteurs = totalVisiteurs + 50;
            default -> System.out.println("Il n'y a eu aucun humaine");
        }
    }

     */



}
