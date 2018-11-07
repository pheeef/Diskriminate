package phil.fsst;
import java.lang.Math;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //a+x^2 + bx + c = 0

<<<<<<< HEAD
=======


>>>>>>> bf8b66aaacaa504af05b98acefa4bce38b49fddc
        // Start
        float a=0;
        float b=0;
        float c=0;
        float p=0;
        float q=0;
        double xkp, xkn, quadratkp, quadratkn; //xk kleine Diskriminante ergebnis; quadratzahl;  p = positiv; n = negativ
        double xgp, xgn, quadratgp, quadratgn; //xg große Diskriminante ergebnis; quadratzahl;  p = positiv; n = negativ


        //Input

        String Decide = JOptionPane.showInputDialog("Wähle ob du die \ngroße Diskriminaten [1] \noder \nkleine Diskrimante[2]");
        int decide = Integer.parseInt(Decide);

        if (decide == 1) {

            String Input = JOptionPane.showInputDialog("Gib deine Gleichung in diesem Format ein: a*x^2+b*x+c=0 \n!WICHTIG! KEINE LEERZEICHEN BENÜTZEN");

            String A = Input.substring(0, 1);
            System.out.println(A);
            a = Float.parseFloat(A);

            String B = Input.substring(6, 7);
            System.out.println(B);
            b = Float.parseFloat(B);

            String C = Input.substring(10, 11);
            System.out.println(C);
            c = Float.parseFloat(C);


            JOptionPane.showMessageDialog(null, "Deine Eingabe lautet: " + A + "*x^2 + " + B + "*x + " + C + " = 0");

        }

        if (decide == 2) {

            String InputB = JOptionPane.showInputDialog("Gib deine Gleichung in diesem Format ein: (p/2)^2-q \n!WICHTIG! KEINE LEERZEICHEN BENÜTZEN");

            String P = InputB.substring(1, 2);
            System.out.println(P);
            p = Float.parseFloat(P);

            String Q = InputB.substring(8, 9);
            System.out.println(Q);
            q = Float.parseFloat(Q);

            JOptionPane.showMessageDialog(null, "Deine Eingabe lautet: D = (" + P + "/2)^2-" + Q);

            //Kleine Diskriminante
            //Kleine Diskriminante positiv
            quadratkp = (((p / 2) * (p / 2)) - q);
            xkp = -(p / 2) + Math.sqrt(quadratkp);

            //Kleine Diskriminante negativ
            quadratkn = (((p / 2) * (p / 2)) - q);
            xkn = -(p / 2) - Math.sqrt(quadratkn);

            System.out.println(xkp);
            System.out.println(xkn);

            //große Diskriminante
            //große Diskriminante positiv
            quadratgp = b * b;
            xgp = (-b + Math.sqrt(quadratgp - (4 * a * c))) / (2 * a);

            //große Diskriminante negativ
            quadratgn = b * b;
            xgn = (-b - Math.sqrt(quadratgn - (4 * a * c))) / (2 * a);

            System.out.println(xgp);
            System.out.println(xgn);

            if(xkp > 0){
                //2 Reelle Lösungen
            }else if( xkp == 0){
                //1 Lösung
            }else if(xkp < 0){
                //Keine Reele Lösung
            }

            if(xgp > 0){
                //2 Reelle Lösungen
            }else if( xgp == 0){
                //1 Lösung
            }else if(xgp < 0){
                //Keine Reele Lösung
            }
<<<<<<< HEAD
=======



>>>>>>> bf8b66aaacaa504af05b98acefa4bce38b49fddc

        }
    }

}