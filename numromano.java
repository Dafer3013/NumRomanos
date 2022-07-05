import java.util.Scanner;

public class numromano {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String romano = "";
        int u, d, c, m;
        int residuo;
        System.out.print("Ingrese el entero: ");
        n = teclado.nextInt();
        residuo = n;

        m = residuo / 1000;
        residuo = residuo % 1000;
        c = residuo / 100;
        residuo = residuo % 100;
        d = residuo / 10;
        residuo = residuo % 10;
        u = residuo;

        for (int i = 1; i <= m; i++) {
            romano += "M";
        }
        switch (c) {
            case 1:
                romano += "C";
                break;
            case 2:
                romano += "CC";
                break;
            case 3:
                romano += "CCC";
                break;
            case 4:
                romano += "CD";
                break;
            case 5:
                romano += "D";
                break;
            case 6:
                romano += "DC";
                break;
            case 7:
                romano += "DCC";
                break;
            case 8:
                romano += "DCCC";
                break;
            case 9:
                romano += "CM";
                break;
        }
        switch (d) {
            case 1:
                romano += "X";
                break;
            case 2:
                romano += "XX";
                break;
            case 3:
                romano += "XXX";
                break;
            case 4:
                romano += "XL";
                break;
            case 5:
                romano += "L";
                break;
            case 6:
                romano += "LX";
                break;
            case 7:
                romano += "LXX";
                break;
            case 8:
                romano += "LXXX";
                break;
            case 9:
                romano += "XC";
                break;
        }
        switch (u) {
            case 1:
                romano += "I";
                break;
            case 2:
                romano += "II";
                break;
            case 3:
                romano += "III";
                break;
            case 4:
                romano += "IV";
                break;
            case 5:
                romano += "V";
                break;
            case 6:
                romano += "VI";
                break;
            case 7:
                romano += "VII";
                break;
            case 8:
                romano += "VIII";
                break;
            case 9:
                romano += "IX";
                break;
        }
        System.out.println("El numero entero en Romano es: " + romano);

    }
}
