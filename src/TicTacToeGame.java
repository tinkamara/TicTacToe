public class TicTacToeGame {
    private TicTacToeField field;
    private Player player1;
    private Player player2;

    public Player getActivePlayer() {
        return activePlayer;
    }

    private Player activePlayer;

    private Player winner;
    private int roundCounter = 0;

    public Player getWinner() {
        return winner;
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public TicTacToeGame(String name1, String name2) throws NoMorePlayersAllowedException{
            field = new TicTacToeField();
            player1 = Player.createPlayer(name1);
            player2 = Player.createPlayer(name2);
            activePlayer = player1;



    }

    public void playRound(int row, int column) throws FieldAlreadyOccupiedException, InvalidIndexException, NotEnoughPlayersException {
        if(Player.getPlayerCount() < 2){
            throw new NotEnoughPlayersException();
        }
            field.setToken(row, column, activePlayer.getToken());
        roundCounter++;
    }
    public void swapPlayer(){
        if (activePlayer.equals(player2)) {
            activePlayer = player1;
        } else {
            activePlayer = player2;
        }
    }


    public boolean checkRows(){
        char[][] currentField = field.getField();
        if(currentField[0][0] != Character.MIN_VALUE &
                Character.compare(currentField[0][0], currentField[0][1]) == 0 &
                Character.compare( currentField[0][1], currentField[0][2]) == 0){
            winner = activePlayer;
                        return true;
        } else if(currentField[1][0] != Character.MIN_VALUE &
                Character.compare(currentField[1][0], currentField[1][1]) == 0 &
                Character.compare( currentField[1][1], currentField[1][2]) == 0){
            winner = activePlayer;
            return true;

        } else if(currentField[2][0] != Character.MIN_VALUE &
                Character.compare(currentField[2][0], currentField[2][1]) == 0 &
                Character.compare( currentField[2][1], currentField[2][2]) == 0) {
            winner = activePlayer;
            return true;
        } else {
            return false;
        }


    }
    public boolean checkColumns(){
        char[][] currentField = field.getField();
        if(currentField[0][0] != Character.MIN_VALUE &
                Character.compare(currentField[0][0], currentField[1][0]) == 0 &
                Character.compare( currentField[1][0], currentField[2][0]) == 0){
            winner = activePlayer;
            return true;
        } else if(currentField[0][1] != Character.MIN_VALUE &
                Character.compare(currentField[0][1], currentField[1][1]) == 0 &
                Character.compare( currentField[1][1], currentField[2][1]) == 0){
            winner = activePlayer;
            return true;

        } else if(currentField[0][2] != Character.MIN_VALUE &
                Character.compare(currentField[0][2], currentField[1][2]) == 0 &
                Character.compare( currentField[1][2], currentField[2][2]) == 0) {
            winner = activePlayer;
            return true;
        } else {
            return false;
        }
    }
    public boolean checkDiagonal(){
        char[][] currentField = field.getField();
        if(currentField[0][0] != Character.MIN_VALUE &
                Character.compare(currentField[0][0], currentField[1][1]) == 0 &
                Character.compare( currentField[1][1], currentField[2][2]) == 0){
            winner = activePlayer;
            return true;
        } else if(currentField[2][0] != Character.MIN_VALUE &
                Character.compare(currentField[2][0], currentField[1][1]) == 0 &
                Character.compare( currentField[1][1], currentField[0][2]) == 0){
            winner = activePlayer;
            return true;
        } else {
            return false;
        }
    }


    public void printField(){
        char[][] currentField = field.getField();
        System.out.println(String.valueOf(currentField[0][0])
                + String.valueOf(currentField[0][1])
                + String.valueOf(currentField[0][2]));
        System.out.println(String.valueOf(currentField[1][0])
                + String.valueOf(currentField[1][1])
                + String.valueOf(currentField[1][2]));
        System.out.println(String.valueOf(currentField[2][0])
                + String.valueOf(currentField[2][1])
                + String.valueOf(currentField[2][2]));
        }

}
