import java.util.Arrays;

public class TicTacToeField {
    private char[][] field;

    public TicTacToeField(){
      field = new char[3][3];
    }
    public void setToken(int row, int column, char token) throws InvalidIndexException,FieldAlreadyOccupiedException {
        if (column > 2 || row > 2) {
            throw new InvalidIndexException();
        } else if (field[row][column] != Character.MIN_VALUE) {
            throw new FieldAlreadyOccupiedException();
        } else {
            field[row][column] = token;
        }
    }

        public char[][] getField(){
            return field;
        }



    }

