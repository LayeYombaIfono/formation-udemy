//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Voiture bmw = new Voiture(); //Instancié la voiture
        Moteur moteurBmw = new Moteur(); // Instancié le moteur

        bmw.nbPortes = 4;
        bmw.automatique = true;
        bmw.color = "Blanche";
//        Creation du moteur
        moteurBmw.carburant = "Diesel";
        moteurBmw.nbCylindre = 4;

        //Afficher les informations du moteur.
        System.out.println("La voiture est "+bmw.color+" et elle dispose "+bmw.nbPortes+" portes.");

        bmw.moteur = moteurBmw;
        System.out.println("Le nombre de cylindre de la voiture est de, "+bmw.moteur.nbCylindre+" son type de carburant est "+bmw.moteur.carburant);

//        Créer une nouvelle voiture
        Voiture odule = new Voiture();
        Moteur oduleMoteur = new Moteur();

        odule.nbPortes = 6;
        odule.color = "Rouge";
        odule.vitesse = 5;
        odule.automatique = true;

//        Le moteur
        oduleMoteur.carburant = "Essence";
        oduleMoteur.nbCylindre=6;
        odule.moteur = oduleMoteur;
        //Afficher les informations du moteur.
        System.out.println("La voiture est "+odule.color+" et elle dispose "+bmw.nbPortes+" portes,"+" le nombre de vitesse est "+odule.vitesse);
        System.out.println("Le nombre de cylindre de la voiture est de, "+odule.moteur.nbCylindre+" son type de carburant est "+odule.moteur.carburant);





        // Début des méthodes
        bmw.klaxonner();

        int nouvelleVitesse = bmw.accelerer();
        System.out.println( "La nouvelle vitesse de la voiture est : "+nouvelleVitesse+" km/h");

       int nouveauRapport =  bmw.passerRapport(true);
       System.out.println("Nouveau rapport est : "+nouveauRapport);

        bmw.tourner(true, 10);

        System.out.println("Nouvelle vitesse : "+bmw.accelerer(2));

        // Fin des méthodes

//        Comparaison des chaines de caractères
        String chaine1 = "Je suis une chaine à comparé";
        String chaine2 = "Je suis une deuxième chaine à comparé";

       if (chaine1.equals(chaine2)){
           System.out.println("Les chaines de caractère sont de même ");
       }else {
           System.out.println("Les chaines de caractère ne sont pas de même ");
       }

//Afficher les informations du moteur.
       bmw.moteur = moteurBmw;

        System.out.println("Le nombre de cylindre de la voiture est de, "+bmw.moteur.nbCylindre+" son type de carburant est "+bmw.moteur.carburant);

        System.out.println("<-------Informations du voyageur------->");
//        Tranport des passagers
        Passager passager = new Passager();
        passager.nom = "Jean";
        passager.prenoms = "IFONO";

        Ville kissidougou = new Ville();
        kissidougou.nomDeLaVille = "Kissidougou";

        Ville destination=bmw.transporter(passager, kissidougou);

        System.out.println("Le passager est arrivé dans la ville de "+destination.nomDeLaVille);

        System.out.println("<----------EXO-21--------->");
//        EXO 21
        System.out.println("Le nombre de roues d'une voiture est de : "+Voiture.nbRoues);
        System.out.println("Le nombre de roues de voiture BMW est : "+ bmw.nbRoues);


    }
}