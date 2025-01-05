public class Planet {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs=0;

    int  revolution(int angle){

        return angle/360;

    }

   int  rotation(int angle){
       return angle/360;
    }

    void accueillirVaisseau(int nbHumaine){
        totalVisiteurs = totalVisiteurs + nbHumaine;
    }

    void accueillirVaisseau(String typeVerseau){

        switch (typeVerseau) {
            case "CHASSEUR" -> totalVisiteurs = totalVisiteurs + 3;
            case "FREGATE" -> totalVisiteurs = totalVisiteurs + 12;
            case "CROISEUR" -> totalVisiteurs = totalVisiteurs + 50;
            default -> System.out.println("Il n'y a eu aucun humaine");
        }
    }



}
