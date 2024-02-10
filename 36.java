import java.util.HashSet;

class Solution {

  public boolean isValidSudoku(char[][] board) {
    if (!isThisMatrixValid(board)) return false;
    // checking all subset of 3x3
    for (int i = 0; i <= 6; i += 3) {
      for (int j = 0; j <= 6; j += 3) {
        char[][] subset3x3 = new char[3][3];
        HashSet<Character> h = new HashSet<>();
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            System.out.print(board[i + k][j + l] + " ");
            if (board[i + k][j + l] != '.' && h.contains(board[i + k][j + l])) {
              return false;
            } else {
              h.add(board[i + k][j + l]);
            }
            subset3x3[k][l] = board[i + k][j + l];
          }
          System.out.println();
        }
        System.out.println("New Matrix");
        // if (!printsub(subset3x3)) {
        //   return false;
        // }
      }
    }
    System.gc();
    return true;
  }

  public static boolean printsub(char[][] x) {
    HashSet<Character> h = new HashSet<>();
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        System.out.print(x[j][i]);
        if (x[i][j] != '.' && h.contains(x[i][j])) {
          System.out.println(x[j][i] + " this Maxtrix is Invalid");
          return false;
        } else {
          h.add(x[j][i]);
        }
      }
      System.out.println(); // Move to the next line after printing each row
    }
    return true;
  }

  public static boolean isThisMatrixValid(char[][] board) {
    // Checking row
    // loop over every row
    for (int i = 0; i < board.length; i++) {
      //   c.printHorizontalc(board[i]);
      if (!IsArrayValid(board[i])) {
        System.err.println(i + " This row is false");
        System.gc();
        return false;
      }
    }
    // checking each colom
    for (int i = 0; i < board.length; i++) {
      HashSet<Character> h = new HashSet<>();
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] != '.' && h.contains(board[j][i])) {
          System.out.println(board[j][i] + " this col is Invalid");

          return false;
        } else {
          h.add(board[j][i]);
        }
      }
    }
    return true;
  }

  public static boolean IsArrayValid(char[] x) {
    HashSet<Character> h = new HashSet<>();
    for (Character character : x) {
      if (character != '.' && h.contains(character)) {
        return false;
      } else {
        h.add(character);
      }
    }

    return true;
  }

  public static void main(String[] args) {
    char[][] inputArrayo = {
      { '.', '.', '.', '.', '5', '.', '.', '1', '.' },
      { '.', '4', '.', '3', '.', '.', '.', '.', '.' },
      { '.', '.', '.', '.', '.', '3', '.', '.', '1' },
      { '8', '.', '.', '.', '.', '.', '.', '2', '.' },
      { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
      { '.', '1', '5', '.', '.', '.', '.', '.', '.' },
      { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
      { '.', '2', '.', '9', '.', '.', '.', '.', '.' },
      { '.', '.', '4', '.', '.', '.', '.', '.', '.' },
    };
    char[][] charArray = {
      { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
      { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
      { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
      { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
      { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
      { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
      { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
      { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
      { '.', '.', '.', '.', '8', '.', '.', '7', '9' },
    };

    Solution s = new Solution();
    System.out.println(s.isValidSudoku(charArray));
  }
}
