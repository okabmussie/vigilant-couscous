package oblig2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main(String[] args) {
    int sum = 0;
    int antall = 0;
    int nedreGrense = 1;
    int øvreGrense = 100;
    String ut = "";
    String innNedreGrense = showInputDialog("skriv inn nedre grense:");
    nedreGrense = Integer.parseInt(innNedreGrense);

    String innØvreGrense = showInputDialog("skriv inn øvre grense :");
    øvreGrense = Integer.parseInt(innØvreGrense);

    while(øvreGrense >=nedreGrense){

        System.out.println(nedreGrense + " + ");

        sum+=nedreGrense;
        nedreGrense++;

        antall++;

        if(antall%10 == 0){

            System.out.println( );
        }
        if(øvreGrense > 100){

            showMessageDialog(null, øvreGrense + " er over grense , prøv på nytt");
        }
        else if(nedreGrense<1){

            showMessageDialog(null, nedreGrense + " lavere enn grensen , prøv påm nytt");
        }
    }

        System.out.print("= "+sum);
    }
}
