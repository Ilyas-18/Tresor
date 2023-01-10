import java.text.DecimalFormat;

public class TestTresor {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");

        Aktie bsaf = new Aktie(5, 63.78, "BSAF", 50);
        Aktie bmw = new Aktie(6, 68.73, "BMW", 50 );

        Schmuck armband = new Schmuck(23, 12400.00, "Armband Schickimicki Cartier, Weißgold massiv");
        Schmuck halskette = new Schmuck(24, 179.95,"GangstaRapper-Kette Prolo, Kupfer");

        Tresor tresor = new Tresor();

        tresor.addGegenstand(bsaf);
        tresor.addGegenstand(bmw);
        tresor.addGegenstand(armband);
        tresor.addGegenstand(halskette);

        try {
            System.out.println(tresor.getGegenstand(5));
        } catch(GegenstandNichtGefundenException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(tresor.getGegenstand(10));
        } catch(GegenstandNichtGefundenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(tresor);

        System.out.println("\nGesamtwert der Gegenstände im Tresor: " + df.format(tresor.getGesamtWert()));

        try {
            tresor.removeGegenstand(bmw);
        } catch (GegenstandNichtGefundenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(tresor);

        System.out.println("\nGesamtwert der Gegenstände im Tresor: " + df.format(tresor.getGesamtWert()));

        try {
            tresor.removeGegenstand(bmw);
        } catch (GegenstandNichtGefundenException e) {
            System.out.println(e.getMessage());
        }
    }
}
