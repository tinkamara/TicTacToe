public class Player {
    private static Player player1 = null;
    private static Player player2 = null;
    private static int playerCount = 0;

    private char token;
    private String name;

    public char getToken() {
        return token;
    }


    public String getName() {
        return name;
    }


    public static int getPlayerCount() {
        return playerCount;
    }

    private Player(char token, String name){
        this.token = token;
        this.name = name;
        playerCount++;
    }
    public static Player createPlayer( String name) throws NoMorePlayersAllowedException{
        if(player1 == null) {
            player1 = new Player('X', name);
            return player1;
        }else if(player2 == null){
            player2 = new Player('O', name);
            return player2;
        } else {
            throw new NoMorePlayersAllowedException();
        }
    }
}
