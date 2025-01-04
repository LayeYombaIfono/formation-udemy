//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Voiture car = new Voiture();

        car.nbPortes = 3;
        car.automatique = true;
        car.color = "Vert";

        System.out.println("La voiture est "+car.color+" et elle dispose "+car.nbPortes+" portes.");

    }
}