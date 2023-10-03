import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        initieraVäxtLista();
        körProgram();
    }
    private static Map<String, Växter> växterHashmap = new HashMap<>();
    // Polymorfism: Superklassen Växter refererar till en subklass i samtliga av "puts" nedan.
    private static void initieraVäxtLista() { //Inkapsulering: Privat metod
        växterHashmap.put("igge", new Kaktus(20));
        växterHashmap.put("laura", new Palm(500));
        växterHashmap.put("meatloaf", new Köttätande(70));
        växterHashmap.put("olof", new Palm(100));
    }
    private static void körProgram() {
        while (true) {
            System.out.println("Vilken växt ska få vätska? (Skriv bara namnet, tom ruta för att avsluta) ");
            Scanner scan = new Scanner(System.in);

            String input = scan.nextLine();
            //Inkaspulering: Hämtar privat data genom en getter
            // Polymorfism: Metoden returnerar en Växter referens som pekar på ett objekt i sina subklasser.
            Växter växt = växterHashmap.get(input.toLowerCase());

            if (växt != null) {
                //Inkapsulering: Hämtar data från getters.
                // Polymorfism: Metoden som anropas beror på vilket växt objekt som körs ovan.
                String vätskeTyp = växt.getVätskeTyp();
                double vätskeBehov = växt.getVätskeBehov();
                System.out.println(String.format("Växten behöver %.0f cl %s", vätskeBehov, vätskeTyp));
            }
            else if (input == "")
                return;

            else {
                System.out.println("Växtens namn finns inte i vårt system, försök igen!");
            }
        }
    }

    }

