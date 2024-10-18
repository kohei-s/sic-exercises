package wetter;

public class Wetter {

    public static void main(String[] argumente) {
        float fah = 86;
        System.out.println(fah + " Grad Fahrenheit ist ...");
        // Konvertiert Fahrenheit in Celsius
        // Subtrahiere erst einmal 32
        fah = fah - 32;
        // teile dann durch 9
        fah = fah / 9;
        // Multipliziere die Antwort dann mit 5
        fah = fah * 5;
        System.out.println(fah + " Grad Celsius\n");

        float cel = 33;
        System.out.println(cel + " Grad Celsius ist ...");
        // konvertiert Celsius in Fahrenheit
        // beginne mit Multiplizieren mit 9
        cel = cel * 9;
        // Dividiere die Antwort mit 5
        cel = cel / 5;
        // Addiere 32 zur Antwort
        cel = cel + 32;
        System.out.println(cel + " Grad Fahrenheit");
    }
}
