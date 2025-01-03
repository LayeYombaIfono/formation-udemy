//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StructureConditionnelle {
    public static void main(String[] args) {
        String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes=0;
        short annee=1500;

        if(annee < 1600 || annee >= 2020){
            System.out.printf("Le programme ne peut pas fournir de résultat pour %d \n", annee);
        } else if (annee < 1700) {
            nbPlanetes = 7;

        } else if (annee < 1800) {
            nbPlanetes = 8;
        } else if (annee<2006){
            nbPlanetes=9;
        }
        else{
            nbPlanetes=8;
        }
        System.out.printf(phraseIntroduction,annee,nbPlanetes);
    }
}