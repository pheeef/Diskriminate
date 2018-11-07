package phil.fsst;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        // Start
        float a=1,b=5,c=6,p = 5,q= 6;
        double xkp, xkn, quadratkp, quadratkn; //xk kleine Diskriminante ergebnis; quadratzahl;  p = positiv; n = negativ
        double xgp, xgn, quadratgp, quadratgn; //xg große Diskriminante ergebnis; quadratzahl;  p = positiv; n = negativ

        //Kleine Diskriminante
        //Kleine Diskriminante positiv
        quadratkp = (((p/2) * (p/2))-q);
        xkp = -(p/2) + Math.sqrt(quadratkp);

        //Kleine Diskriminante negativ
        quadratkn = (((p/2) * (p/2))-q);
        xkn = -(p/2) - Math.sqrt(quadratkn);

        System.out.println(xkp);
        System.out.println(xkn);

        //große Diskriminante
        //große Diskriminante positiv
        quadratgp = b*b;
        xgp = (-b + Math.sqrt(quadratgp-(4*a*c))) / (2*a);

        //große Diskriminante negativ
        quadratgn = b*b;
        xgn = (-b - Math.sqrt(quadratgn -(4*a*c)) )/ (2*a);

        System.out.println(xgp);
        System.out.println(xgn);



    }
}
