import java.util.Arrays;

public class TicTacToeField {
    private char[][] field;

    public TicTacToeField(){
      field = new char[3][3];
    }
    public void setToken(int column, int row, char token) throws InvalidIndexException,FieldAlreadyOccupiedException {
        if (column > 3 || row > 3) {
            throw new InvalidIndexException();
        } else if (field[column][row] != Character.MIN_VALUE) {
            throw new FieldAlreadyOccupiedException();
        } else {
            field[column][row] = token;
        }
    }

        public char[][] getField(){
            return field;
        }



    }

