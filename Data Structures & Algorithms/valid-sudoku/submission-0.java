class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer,Set<Character>> rows = new HashMap<>();
        Map<Integer,Set<Character>> columns = new HashMap<>();
        Map<String,Set<Character>> squares = new HashMap<>();

        for(int i = 0 ; i < board.length; i++) {
            for(int j = 0; j < board[0].length;j++) {
                char c = board[i][j];
                if(c == '.') continue;

                String squaresKey = i/3 + "," + j/3;

                if(rows.computeIfAbsent(i, v -> new HashSet<>()).contains(board[i][j]) || columns.computeIfAbsent(j, v -> new HashSet<>()).contains(board[i][j]) ||
            squares.computeIfAbsent(squaresKey, v -> new HashSet<>()).contains(board[i][j]) ) return false;
            rows.get(i).add(board[i][j]);
            columns.get(j).add(board[i][j]);
            squares.get(squaresKey).add(board[i][j]);
            }
        }

        return true;
        
    }
}
