public class Main {
    public static void main(String[] args) {
        Planet mercure = new Planet();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planet venus = new Planet();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planet terre = new Planet();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planet mars = new Planet();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planet jupiter = new Planet();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planet saturne = new Planet();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planet uranus = new Planet();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planet neptune = new Planet();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";



        System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres.");


        Planet neuf = new Planet();
        System.out.println(neuf.nom+" est une planète "+neuf.matiere+" avec un diamètre de "+neuf.diametre+" kilomètres.");

        System.out.println(neptune.nom+" a effectué "+neptune.revolution(-3542)+" tours complets autour de son étoile.");

        System.out.println(mars.nom+" a effectué "+mars.rotation(-684)+" tours sur elle même.");
        System.out.println(venus.nom+" a effectué "+venus.rotation(1250)+" tours sur elle même.");

//        Exo 18
        System.out.println("<---------------->");
        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");

        System.out.println(" Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+ mars.totalVisiteurs);

        //        Atmosphère
        Atmosphere atmosphereUranus = new Atmosphere();
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
    }
}
