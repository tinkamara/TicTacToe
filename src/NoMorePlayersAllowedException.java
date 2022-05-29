public class NoMorePlayersAllowedException extends Exception{

    public String message = "Es kann nur zu zweit gespielt werden!";

    public NoMorePlayersAllowedException(){

    }

    @Override
    public String getMessage() {
        return message;
    }
}
