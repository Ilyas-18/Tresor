public class Schmuck extends Gegenstand {

        // Bezeichnung des Schmucks
        private String bezeichnung;

        public Schmuck(int id, int wert, String bezeichnung) {
            // Aufruf des Konstruktors der Elternklasse (Gegenstand)
            super(id, wert);
            // Setzen der Bezeichnung
            this.bezeichnung = bezeichnung;
        }

        // Nutzen von toString(), um Informationen über den Schmuck zu liefern
        @Override
        public String toString() {
            return "Schmuck: ID = " + getId() + ", Bezeichnung = " + bezeichnung + ", Wert = " + getWert();
        }
    }
