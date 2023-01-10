public class GegenstandNichtGefundenException extends Exception {

    private int id;

    public GegenstandNichtGefundenException(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String getMessage() {
        String text = "\nDer Gegenstand mit der ID " + getId() + " ist nicht im Tresor vorhanden!";
        return text;
    }
}
