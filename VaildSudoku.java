import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VaildSudoku {
    public boolean isValidSudoku(char[][] board) {

        // #1.
//        Map<Character, Boolean> map = new HashMap<>();
//
//        // 1.horizontal
//        for (int i = 0; i < board.length; i++) {
//            map.clear();
//            for (int j = 0; j < board[i].length; j++) {
//                if(board[i][j] != '.'){
//                    if(!map.getOrDefault(board[i][j], false)){
//                        map.put(board[i][j], true);
//                    }else{
//                        return false;
//                    }
//                }
//            }
//        }
//        // 2.vertical
//        for (int i = 0; i < board.length; i++) {
//            map.clear();
//            for (int j = 0; j < board.length; j++) {
//                if(board[j][i] != '.'){
//                    if(!map.getOrDefault(board[j][i], false)){
//                        map.put(board[j][i], true);
//                    }else{
//                        return false;
//                    }
//                }
//            }
//        }
//        // 3.each small square
//        for(int h=0; h<board.length; h+=3){
//            for(int v=0; v<board.length; v+=3){
//
//                map.clear();
//                int x, y = 0;
//                for (int i = 0; i < 3; i++) {
//                    y = h+i;
//                    for (int j = 0; j < 3; j++) {
//                        x = v+j;
//                        if(board[y][x] != '.'){
//                            if(!map.getOrDefault(board[y][x], false)){
//                                map.put(board[y][x], true);
//                            }else{
//                                return false;
//                            }
//                        }
//                    }
//                }
//            }
//
//        }

        // #2. make String to verify if it has the number
        //     row => 3(5) meaning : number 5 is in 3rd row
        //     column => (3)7 meaning : number 3 is in 7th column
        //     inside => 0(2)2 meaning : number 2 is the top-right border

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] != '.'){
                    String str = "(" + board[i][j] + ")";
                    if (!seen.add(i + str) || !seen.add(str + j) || !seen.add(i / 3 + str + j / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char [][] board =
                {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        VaildSudoku vs = new VaildSudoku();
        vs.isValidSudoku(board);
    }

}
