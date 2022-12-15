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
    public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtGefundenException {
        if (!gegenstaende.remove(gegenstand)) {
            // Wenn der Gegenstand nicht in der Liste vorhanden ist, wird die Exception geworfen
            throw new GegenstandNichtGefundenException("Der Gegenstand mit der ID " + gegenstand.getId() + " wurde nicht gefunden.");
        }
    }

    // Ermitteln eines Gegenstands im Tresor anhand seiner ID
    public Gegenstand getGegenstand(int id) throws GegenstandNichtGefundenException {
        // Suchen des Gegenstands in der Liste
        for (Gegenstand gegenstand : gegenstaende) {
            if (gegenstand.getId() == id) {
                // Gegenstand wurde gefunden und wird zurückgegeben
                return gegenstand;
            }
        }

        // Wenn der Gegenstand nicht gefunden wurde, wird die Exception geworfen
        throw new GegenstandNichtGefundenException("Der Gegenstand mit der ID " + id + " wurde nicht gefunden.");
    }

    // Berechnen des Gesamtwertes aller Gegenstände im Tresor
    public int getGesamtWert() {
        int gesamtWert = 0;
        for (Gegenstand gegenstand : gegenstaende) {
            gesamtWert += gegenstand.getWert();
        }
        return gesamtWert;
    }

    // Nutzen von toString(), um Informationen über den Tresor und seine Gegenstände zu liefern
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tresorinhalt:\n");
        for (Gegenstand gegenstand : gegenstaende)
    }
}
