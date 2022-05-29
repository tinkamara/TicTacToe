import java.util.Scanner;

public class Game {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Hallo Spieler!");
            System.out.println("Spieler 1, gib deinen Namen ein:");
            String name1 = in.next();
            System.out.println("Spieler 2, gib deinen Namen ein:");
            String name2 = in.next();

            try {
                TicTacToeGame game = new TicTacToeGame(name1, name2);



            boolean isWon = false;
            Player currentPlayer;
            while( !isWon & game.getRoundCounter() < 9 ){
                currentPlayer = game.getActivePlayer();
                game.printField();
                System.out.println(currentPlayer.getName() + "! Dein Token ist " + currentPlayer.getToken() );

                System.out.println("Gib die Zeile ein:");
                int row = in.nextInt();
                System.out.println("Gib die Spalte ein:");
                int column = in.nextInt();
                try {
                    game.playRound(row, column);

                } catch (FieldAlreadyOccupiedException faoe){
                    System.out.println(faoe.getMessage());
                    continue;

                } catch(InvalidIndexException iie) {
                    System.out.println(iie.getMessage());
                    continue;
                }catch(NotEnoughPlayersException nepe) {
                    System.out.println(nepe.getMessage());
                    System.exit(4);
                }
                isWon = game.checkRows() || game.checkColumns() || game.checkDiagonal();
                game.swapPlayer();
            }

            if(isWon){
                System.out.println(game.getWinner().getName() + ", du hast gewonnen! Glückwunsch!");

            }else{
                System.out.println("Unentschieden!");
            }
            }catch(NoMorePlayersAllowedException nmpae){
                System.out.println(nmpae.getMessage());
                System.exit(4);
            }

        }



}
