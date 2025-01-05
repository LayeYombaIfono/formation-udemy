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


    }
}
