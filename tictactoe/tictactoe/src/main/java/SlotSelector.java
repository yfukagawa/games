import java.util.Scanner;

public class SlotSelector {
    Scanner scan = new Scanner(System.in);
    int slotIndex;
    String slotDisplay;
    Board board = new Board();
    
    public int player() {
            
        System.out.println("\nPlayer's turn.\n\nPlease select the slot by entering its number.");
        int playerChoice = playerAcrions();
        return playerChoice;
        
    }

    public int playerAcrions() {
        slotDisplay = scan.nextLine();
        if (slotDisplay.equals("1") || slotDisplay.equals("2") || slotDisplay.equals("3") || 
            slotDisplay.equals("4") || slotDisplay.equals("5") || slotDisplay.equals("6") || 
            slotDisplay.equals("7") || slotDisplay.equals("8") || slotDisplay.equals("9")) {
                switch (slotDisplay) {
                    case "1": slotIndex = 0; break;
                    case "2": slotIndex = 1; break;
                    case "3": slotIndex = 2; break;
                    case "4": slotIndex = 3; break;
                    case "5": slotIndex = 4; break;
                    case "6": slotIndex = 5; break;
                    case "7": slotIndex = 6; break;
                    case "8": slotIndex = 7; break;
                    case "9": slotIndex = 8; break;
                }
                
            } else if(board.elements[slotIndex].equals("P") || board.elements[slotIndex].equals("C") ) {
                System.out.println("Invalid choice.\n\nThis solot is already taken.\nPlease choose other slot.");
                playerAcrions();
            } else {
                System.out.println("Invalid choice.\n\nPlease choose a slot by entering a number between 1 - 9.");
                playerAcrions();
            }
            
            return slotIndex;
    }

    public int computer() {
        System.out.println("\nComputer's turn.");
        int computerChoice = computerActions();
        return computerChoice;
    }

    public int computerActions() {
        int slotChoice = index();

        while (board.elements[slotChoice].equals("P") || board.elements[slotChoice].equals("C")) {
            slotChoice = index(); 
        }
        return slotChoice;
    }

    public int index() {
        int i = (int)(Math.random()*10);
        while(i >= board.elements.length) {
            i = (int)(Math.random()*10); 
        }
        return i;
    }
}
