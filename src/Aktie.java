public class Aktie extends Gegenstand{

        // Name des Unternehmens
        private String unternehmen;

        // Nennwert der Aktie
        private int nennwert;

        public Aktie(int id, double wert, String unternehmen, int nennwert) {
            // Aufruf des Konstruktors der Elternklasse (Gegenstand)
            super(id, wert);
            // Setzen des Unternehmens und des Nennwerts
            this.unternehmen = unternehmen;
            this.nennwert = nennwert;
        }

        // Nutzen von toString(), um zusätzliche Informationen über die Aktie zu liefern
        @Override
        public String toString() {
            return super.toString() + ", Unternehmen = " + unternehmen + ", Nennwert = " + nennwert;
        }
    }
