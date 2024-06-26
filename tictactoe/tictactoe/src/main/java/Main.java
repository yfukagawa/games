public class Main {
    static Board board = new Board();
    static SlotSelector slotSelector = new SlotSelector();
    static int playerIndex;
    static int computerIndex;
    static int state = 0;
    
    public static void main(String[] args) {
        
        board.createBoard();

        while(board.boardState() == 0) {
            playerTurn();
            stateMessage(board.boardState());
            if(board.boardState() == 1) break;
            computerTurn();
            stateMessage(board.boardState());
            if(board.boardState() == 1) break;
        }

        
    }

    public static void playerTurn() {
        playerIndex = slotSelector.player();

        while (board.elements[playerIndex].equals("C") || board.elements[computerIndex].equals("P")) {
            System.out.println("Invalid choice.\nThis solot is already taken.\nPlease choose other slot.");
            playerTurn();
        } 
        
        board.elements[playerIndex] = "P";
    
        board.createBoard();
        state = board.boardState();
    }

    public static void computerTurn() {
        computerIndex = slotSelector.computer();
        while (board.elements[playerIndex].equals("C") || board.elements[computerIndex].equals("P")) {
            computerTurn();
        }
        
        board.elements[computerIndex] = "C";
        
        board.createBoard();
        state = board.boardState();
    }
    
    public static void stateMessage(int i) {
        if(i == 0) {
            System.out.println("KEEP GOING");
        } else {
            System.out.println("GAME SET");
        }
    }
}


