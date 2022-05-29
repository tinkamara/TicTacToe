public class InvalidIndexException extends Exception{
    public String message = "Feld nicht auf dem Spielfeld Zeile/Spalte: ";
    public InvalidIndexException() {

    }

    public InvalidIndexException( int line, int column) {
        message = message + line + "/" + column +"/n Nochmal!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
