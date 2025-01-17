public class PlanetTellurique extends Planet implements Habitable{

    Vaisseau vaisseauAcoste;
    int totalVisiteurs;



    PlanetTellurique(String nom) {
        super(nom);
    }

    @Override
    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau) {

        if (nouveauVaisseau instanceof VaisseauDeGuerre){
           ((VaisseauDeGuerre) nouveauVaisseau).desactiveArmes();

        }

        totalVisiteurs+=nouveauVaisseau.nbPassagers;
        Vaisseau vaisseauPrecedent = vaisseauAcoste;
        vaisseauAcoste = nouveauVaisseau;

        return vaisseauPrecedent;
    }
}
