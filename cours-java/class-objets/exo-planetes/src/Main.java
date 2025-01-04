public class Main {
    public static void main(String[] args) {
        Planet mercure = new Planet();
        Planet venus = new Planet();
        Planet mars = new Planet();
        Planet jupiter = new Planet();

        mercure.nom = "Mercure";
        mercure.diametre = 14785;
        mercure.matiere = "Telluriques";

        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";

        System.out.println(mercure.nom + " est une planète " + mercure.matiere +" avec un diamètre de " + mercure.diametre + " kilomètres.");
        System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");
    }
}
