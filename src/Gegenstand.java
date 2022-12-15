public abstract class Gegenstand {

        // Eindeutige ID des Gegenstands
        private int id;

        // Wert des Gegenstands
        private int wert;

        public Gegenstand(int id, int wert) {
            // Setzen der ID und des Werts beim Erstellen des Gegenstands
            this.id = id;
            this.wert = wert;
        }

        // Getter-Methode für die ID
        public int getId() {
            return id;
        }

        // Getter-Methode für den Wert
        public int getWert() {
            return wert;
        }

        // Nutzen von toString(), um allgemeine Informationen über den Gegenstand zu liefern
        @Override
        public String toString() {
            return "Gegenstand: ID = " + getId() + ", Wert = " + getWert();
        }
    }


