public class UC1 {
    public static void main(String[] args) {
        char[] board = new char[10];

        for (int i = 0; i < 9; i++) {
            board[i] = '-';
        }
        showBoard(board);
    }
    public static void showBoard(char[] board) {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------- ");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------- ");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------- ");
    }
}
