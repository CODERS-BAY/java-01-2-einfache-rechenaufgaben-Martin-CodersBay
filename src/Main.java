public class Main {

    public static void main(String[] args) {

        int zahl1=333, zahl2=55;
        int summe, differenz, produkt, quotient;

        double zahl3=333.33, zahl4=55.55;
        double summe2, differenz2, produkt2, quotient2;


        summe=zahl1+zahl2;
        differenz=zahl1-zahl2;
        produkt=zahl1*zahl2;
        quotient=zahl1/zahl2;

        summe2=zahl3+zahl4;
        differenz2=zahl3-zahl4;
        produkt2=zahl3*zahl4;
        quotient2=zahl3/zahl4;

        System.out.println(zahl1 + " + " + zahl2 + " = " + summe);
        System.out.println(zahl1 + " - " + zahl2 + " = " + differenz);
        System.out.println(zahl1 + " * " + zahl2 + " = " + produkt);
        System.out.println(zahl1 + " / " + zahl2 + " = " + quotient);

        System.out.printf("%.2f + %.2f = %.2f\n", zahl3,zahl4,summe2);
        System.out.printf("%.2f + %.2f = %.2f\n", zahl3,zahl4,differenz2);
        System.out.printf("%.2f + %.2f = %.2f\n", zahl3,zahl4,produkt2);
        System.out.printf("%.2f + %.2f = %.2f\n", zahl3,zahl4,quotient2);
    }

}

