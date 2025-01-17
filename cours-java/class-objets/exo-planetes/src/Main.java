import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PlanetTellurique mercure = new PlanetTellurique("Mercure");
        mercure.diametre = 4880;

        PlanetTellurique venus = new PlanetTellurique( "Venus");
        venus.diametre = 12100;

        PlanetTellurique terre = new PlanetTellurique("Terre");
        terre.diametre = 12756;

        PlanetTellurique mars = new PlanetTellurique( "Mars");
        mars.diametre = 6792;

        PlanetGazeuse jupiter = new PlanetGazeuse("Jupiter");
        jupiter.diametre = 142984;


        PlanetGazeuse saturne = new PlanetGazeuse("Saturne");
        saturne.diametre = 120536;

        PlanetGazeuse uranus = new PlanetGazeuse("Uranus");
        uranus.diametre = 51118;

        PlanetGazeuse neptune = new PlanetGazeuse("Neptune");
        neptune.diametre = 49532;


        // Exo-30

        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 9;

        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers = 15;

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers =  12;


        Vaisseau cargo = new VaisseauDeGuerre("CARGO");
        cargo.nbPassagers = 16;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel vaisseau souhaitez-vous sélectionner ?");
        String vaisseauSelectionne = sc.nextLine();

        System.out.println("Sur quelle planète voulez-vous poser (Mercure, Venus, Terre ou Mars) ?");
        String planeteSelectionne = sc.nextLine();

        System.out.println("Quel tonnage souhaitez-vous embarquer ?");
        int tonnage = sc.nextInt();

        Vaisseau vaisseau = switch (vaisseauSelectionne) {
            case "CHASSEUR" -> chasseur;
            case "FREGATE" -> fregate;
            case "CARGO" -> cargo;
            case "CROISEUR" -> croiseur;
            case "VAISSEAU-MONDE" -> vaisseauMonde;
            default -> null;
        };

        PlanetTellurique planete = switch (planeteSelectionne) {
            case "Mercure" -> mercure;
            case "Venus" -> venus;
            case "Mars" -> mars;
            case "Terre" -> terre;
            default -> null;
        };

        assert planete != null;
        planete.accueillirVaisseau(vaisseau);

        assert vaisseau != null;
        int rejet = vaisseau.emporterCargaison(tonnage);

        System.out.println("Le rejet est de "+rejet);





       // System.out.println(jupiter.nom+" est une planète  avec un diamètre de "+jupiter.diametre+" kilomètres.");


//        Planet neuf = new Planet();
//        System.out.println(neuf.nom+" est une planète "+neuf.matiere+" avec un diamètre de "+neuf.diametre+" kilomètres.");
/*
        System.out.println(neptune.nom+" a effectué "+neptune.revolution(-3542)+" tours complets autour de son étoile.");

        System.out.println(mars.nom+" a effectué "+mars.rotation(-684)+" tours sur elle même.");
        System.out.println(venus.nom+" a effectué "+venus.rotation(1250)+" tours sur elle même.");*/

//        Exo 18
        System.out.println("<---------------->");
        //mars.accueillirVaisseau(8);
        //mars.accueillirVaisseau("FREGATE");

       // System.out.println(" Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+ mars.totalVisiteurs);

        // Atmosphère
/*        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxDeMethane = 2.5f;
        uranus.atmosphere = atmosphereUranus;

        System.out.println("L'atmosphère de Uranus est composée :");
        System.out.println("A "+uranus.atmosphere.tauxHydrogene+"% d'hydrogène.");
        System.out.println("A "+uranus.atmosphere.tauxHelium+"% d'hélium.");
        System.out.println("A "+uranus.atmosphere.tauxAzote+"% d'azote.");
        System.out.println("A "+uranus.atmosphere.tauxDeMethane+"% de méthane.");
        System.out.println("A "+uranus.atmosphere.tauxArgon+"% de Argon.");
        System.out.println("A "+uranus.atmosphere.tauxDioxydeDeCarbone+"% Dioxyde de carbone.");
        System.out.println("A "+uranus.atmosphere.tauxDeSodium+"% de sodium.");

        System.out.println("<------------------>");*/

//        Méthode vaisseau
        /*Vaisseau nouveauVaisseau = new VaisseauDeGuerre("FREGATE");
        nouveauVaisseau.nbPassagers = 9;
        mars.accueillirVaisseau(nouveauVaisseau);

        Vaisseau autreVaisseau = new VaisseauDeGuerre("CROISEUR");
        autreVaisseau.nbPassagers = 42;
        mars.accueillirVaisseau(autreVaisseau);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur "+ mars.nom + " est actuellement de " + mars.totalVisiteurs);
*/
//        EXO 21
/*        System.out.println("La forme d'une planète est : "+Planet.forme);
        System.out.println("La forme de "+mars.nom +" est: "+Planet.forme);


        System.out.println("<---------EXO-22------->");*/

//      EXO 22
/*        String expansion1 =  Planet.expansion(10.5);
        System.out.println(expansion1);
        String expansion2 =  Planet.expansion(14.2);
        System.out.println(expansion2);*/


//        EXO 23
 /*       System.out.println("Nombre de planetes decouvertes est de : "+Planet.nbPlanetesDecouvertes);

        System.out.println("<-------------------EXO 24-------------------------->");*/

//        EXO 24
/*        VaisseauDeGuerre chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;*/
//        chasseur.type = "CHASSEUR";

/*        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;*/
//        vaisseauMonde.type = "VAISSEAU-MONDE";

/*
       vaisseauMonde.activerBouclier();
       chasseur.activerBouclier();

        chasseur.attaque(vaisseauMonde, "Lasers photonique", 3);

       vaisseauMonde.desactiverBouclier();

        System.out.println("La résistance du bouclier du vaisseau est "+vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blingade du vaisseau monde est "+vaisseauMonde.blindage);
*/


//        EXO-26
       /* mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);*/


//        EXO-27
//        construire le chasseur
      /*  Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);
        System.out.println("Le chasseur a rejeté " + chasseurSurTerre.emporterCargaison(20)+" tonnes.");*/

//        Construire les frégates apartir de la classe VaisseauDeGuerre

//        Frégate 1
       /* Vaisseau fregateSurTerre1 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre1.nbPassagers = 100;
        terre.accueillirVaisseau(fregateSurTerre1);
        System.out.println("La frégate a été rejeté "+ fregateSurTerre1.emporterCargaison(45)+" tonnes");
        System.out.println("La frégate a été rejeté "+ fregateSurTerre1.emporterCargaison(12)+" tonnes");*/

//        Frégate 2
       /* Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre2.nbPassagers = 14;
        terre.accueillirVaisseau(fregateSurTerre2);
        System.out.println("La frégate 2 a rejeté "+ fregateSurTerre2.emporterCargaison(30)+" tonnes");*/


//        Construire vaisseau-monde apartir de la classe VaisseauCivil
       /* Vaisseau vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(vaisseauMondeSurTerre);
        System.out.println("Le vaisseau monde a rejeté "+vaisseauMondeSurTerre.emporterCargaison(1560)+" tonnes.");
        System.out.println("Le vaisseau monde a rejeté "+vaisseauMondeSurTerre.emporterCargaison(600)+" tonnes.");*/


    }
}
