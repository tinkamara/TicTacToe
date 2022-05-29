public class FieldAlreadyOccupiedException extends Exception{

    public String message = "Feld bereits belegt Zeile/Spalte: ";
    public FieldAlreadyOccupiedException() {

    }

    public FieldAlreadyOccupiedException( int line, int column) {
        message = message + line + "/" + column +"/n Nochmal!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
