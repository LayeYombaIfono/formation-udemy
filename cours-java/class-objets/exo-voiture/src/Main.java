//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Voiture car = new Voiture();

        car.nbPortes = 3;
        car.automatique = true;
        car.color = "Vert";

        System.out.println("La voiture est "+car.color+" et elle dispose "+car.nbPortes+" portes.");

        car.klaxonner();

        int nouvelleVitesse = car.accelerer();
        System.out.println( "La nouvelle vitesse de la voiture est : "+nouvelleVitesse+" km/h");


       int nouveauRapport =  car.passerRapport(true);
        System.out.println("Nouveau rapport est : "+nouveauRapport);

        car.tourner(true, 10);

    }
}