import java.util.ArrayList;
import java.util.List;

public class Tresor {

    // Liste zum Speichern der Gegenstände im Tresor
    private List<Gegenstand> gegenstaende;

    public Tresor() {
        // Initialisieren der Liste beim Erstellen des Tresors
        gegenstaende = new ArrayList<>();
    }

    // Hinzufügen eines Gegenstands zum Tresor
    public void addGegenstand(Gegenstand gegenstand) {
        gegenstaende.add(gegenstand);
    }

    // Entfernen eines Gegenstands aus dem Tresor
    public void removeGegenstand(Gegenstand g) throws GegenstandNichtGefundenException {
        if (!gegenstaende.remove(g)) {
            // Wenn der Gegenstand nicht in der Liste vorhanden ist, wird die Exception geworfen
            throw new GegenstandNichtGefundenException(g.getId());
        }
    }

    // Ermitteln eines Gegenstands im Tresor anhand seiner ID
    public Gegenstand getGegenstand(int id) throws GegenstandNichtGefundenException {
        // Suchen des Gegenstands in der Liste
        for (Gegenstand g : gegenstaende) {
            if (g.getId() == id) {
                // Gegenstand wurde gefunden und wird zurückgegeben
                return g;
            }
        }

        // Wenn der Gegenstand nicht gefunden wurde, wird die Exception geworfen
        throw new GegenstandNichtGefundenException(id);
    }

    // Berechnen des Gesamtwertes aller Gegenstände im Tresor
    public double getGesamtWert() {
        double gesamtWert = 0;
        for (Gegenstand g : gegenstaende) {
            gesamtWert += g.getWert();
        }
        return gesamtWert;
    }

    // Nutzen von toString(), um Informationen über den Tresor und seine Gegenstände zu liefern
    @Override
    public String toString() {
        String text;
        text = "\n\nTRESOR-INHALT:";
        for (Gegenstand g : gegenstaende) {
            text += g.toString();
        }
        return text;
    }
}
