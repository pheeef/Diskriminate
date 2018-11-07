package phil.fsst;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //a+x^2 + bx + c = 0



        // Start
        float a,b,c,p,q;


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

            String P = InputB.substring(1,2);
            System.out.println(P);
            p = Float.parseFloat(P);

            String Q = InputB.substring(8,9);
            System.out.println(Q);
            q = Float.parseFloat(Q);

            JOptionPane.showMessageDialog(null, "Deine Eingabe lautet: D = (" + P +"/2)^2-" + Q);



        }

    }
}
