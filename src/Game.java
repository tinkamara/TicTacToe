import java.util.Scanner;

public class Game {

        public static void main(String[] args) {
            Scanner eingabe = new Scanner(System.in);
            System.out.println("Hallo Spieler!");
            System.out.println("Spieler 1, gib deinen Namen ein:");
            String name1 = eingabe.next();
            System.out.println("Spieler 2, gib deinen Namen ein:");
            String name2 = eingabe.next();
            TicTacToeGame game = new TicTacToeGame(name1, name2);


            boolean isWon = false;
            Player currentplayer = null;
            while( !isWon & game.getRoundCounter() < 9 ){
                currentplayer = game.getActivePlayer();
                game.printField();
                System.out.println(currentplayer.getName() + "! Dein Token ist " + currentplayer.getToken() );

                System.out.println("Gib die Zeile ein:");
                int column = eingabe.nextInt();
                System.out.println("Gib die Spalte ein:");
                int row = eingabe.nextInt();
                try {
                    game.playRound(column, row);

                } catch (FieldAlreadyOccupiedException faoe){
                    System.out.println("Feld bereits auf dem Spielfeld besetzt!");
                    continue;

                } catch(InvalidIndexException iie){
                    System.out.println("Feld nicht auf dem Spielfeld!");
                    continue;


                }
                isWon = game.checkRows() || game.checkColumns() || game.checkDiagonal();
                game.swapPlayer();
            }

            if(isWon){
                System.out.println(game.getWinner().getName() + ", du hast gewonnen! Glückwunsch!");

            }else{
                System.out.println("Unentschieden!");
            }

        }



}
