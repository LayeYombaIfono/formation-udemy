public class StructureSwitchCase {
    public static void main(String[] args) {

        /*

        int mois = 4;

        switch (mois){
            case 1:
                System.out.println("Janvier");
                break;

            case 2:
                System.out.println("Fevrier");
                break;

            case 3:
                System.out.println("Mars");
                break;
            default:
                System.out.println("Ce mois n'existe pas");
        }

         */

//        EXO
        int nbPlanete = 10;
        String message = "Le programme ne peut pas fournir de résultat pour %d.";

        switch (nbPlanete){
            case 7:
                System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                break;
            case 8:
                System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                break;

            case 9:
                System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                break;
            default:
                System.out.printf(message,nbPlanete);
        }

    }

}
