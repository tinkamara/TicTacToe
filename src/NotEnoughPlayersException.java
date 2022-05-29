public class NotEnoughPlayersException extends Exception{
    public String message = "Es werden 2 Spieler benötigt!";

    public NotEnoughPlayersException(){

    }
    public String getMessage(){
        return message;
    }
}
