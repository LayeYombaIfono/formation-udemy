public class VaisseauCivil extends Vaisseau {

//    Constructeur
     VaisseauCivil(String type) {
         this.type = type;

         switch (type){
             case "CARGO" -> tonnageMax = 500;
             case "VAISSEAU-MONDE"-> tonnageMax = 2000;
         }
    }

//    Méthode redefinie
    @Override
    int emporterCargaison(int cargaison) {
         int tonnageRestant = tonnageMax - tonnageActuel;

         if (cargaison > tonnageRestant){
             tonnageActuel = tonnageMax;
             return cargaison - tonnageRestant;
         }else {
             tonnageActuel = tonnageActuel + cargaison;
             return 0;
         }

    }
}
