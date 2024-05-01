public class Board {
    public String elements[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public void createBoard() {
        String boardVisual = "\n   -   -   - \n" +
        " | " +elements[0] + " | " + elements[1] + " | " + elements[2] + " | \n" +
        "   -   -   - \n" +
        " | " +elements[3] + " | " + elements[4] + " | " + elements[5] + " | \n" + 
        "   -   -   - \n" +
        " | " +elements[6] + " | " + elements[7] + " | " + elements[8] + " | \n" +
        "   -   -   - \n" ;
        System.out.println(boardVisual);
    }

    public int boardState() {
        int state = 0;
        for (int i = 0; i < elements.length; i++) {
            if((elements[i].equals("O") || elements[i].equals("X")) && 
            (
                (elements[0].equals(elements[1]) && elements[0].equals(elements[2])) ||
                (elements[0].equals(elements[4]) && elements[0].equals(elements[8])) ||
                (elements[0].equals(elements[3]) && elements[0].equals(elements[6])) ||
                (elements[3].equals(elements[4]) && elements[3].equals(elements[5])) ||
                (elements[6].equals(elements[7]) && elements[6].equals(elements[8])) ||
                (elements[1].equals(elements[4]) && elements[1].equals(elements[7])) ||
                (elements[2].equals(elements[5]) && elements[2].equals(elements[8])) ||
                (elements[2].equals(elements[4]) && elements[2].equals(elements[6]))
            )
            ) {
            state = 1;
            } else {
            state = 0;
            }
        }
       return state;

    }
    
    

}
