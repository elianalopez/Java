import java.util.*;

class Game {
    //This keeps track of the positions
    //Citation
    /*
    A helpful document of the arraylist implementation that I used :)
    https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
     */
    ArrayList<Integer> playerPos1 = new ArrayList<Integer>();
    ArrayList<Integer> playerPos2 = new ArrayList<Integer>();
    ArrayList<Integer> CPUPos1 = new ArrayList<Integer>();
    ArrayList<Integer> CPUPos2 = new ArrayList<Integer>();
    static ArrayList<String> winners = new ArrayList<String>(); //winners list
    public static void main(String[] args) throws InterruptedException {

        //The gameBoard is a 2d array

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        welcome();

//Citations
/*
The Start of the game menu
https://www.youtube.com/watch?v=1sePP8wtInE
learned to create this menu by watching this video on how to implement it.
*/

        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print("1.) Single Player Mode\n");
            System.out.print("2.) Two Player Mode\n");
            System.out.print("3.) Spectator Mode\n");
            System.out.print("4.) Instructions\n");
            System.out.print("5.) Winner List\n");
            System.out.print("\nEnter Your Menu Choice: ");
            choice = input.nextInt();
            //nextInt() is a method from the java.util.Scanner
//Citations
 /*
Got stuck here, so I found a solution that I modified to my needs from this website
https://stackoverflow.com/questions/40417422/non-static-method-cannot-be-referenced-from-a-static-context-what-is-static
End result:
Game game = new Game();
game.twoPlayer(gameBoard);
*/

            switch (choice) {
                case 1:
                    Game oneGame = new Game();
                    oneGame.onePlayer(gameBoard);
                    break;
                case 2:
                    Game twoGame = new Game();
                    twoGame.twoPlayer(gameBoard);
                    break;
                case 3:
                    Game cpuGame = new Game();
                    cpuGame.spectator(gameBoard);
                    break;
                case 4:
                    instructions();
                    break;
                case 5:
                    winners();
                    break;
                default:
                    System.out.println("\nThis is not a valid Menu Option! Please Select Another!!\n");
                    //if inputs do not match cases this will print
                    break;
            }
        }

    }

/*
----------------------------------------------------------------------------------------------------------
METHOD PARTY
METHOD PARTY
METHOD PARTY
METHOD PARTY
METHOD PARTY
METHOD PARTY
----------------------------------------------------------------------------------------------------------
The scope of Method is still located within the Main class
 */

//Citations
/*
ALL ASCII Art Font from
http://patorjk.com/software/taag/#p=display&f=Star%20Wars&t=Tic-Tac-Toe%0A%20
*/

    public static void welcome() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(".___________. __    ______        .___________.    ___        ______        .___________.  ______    _______ ");
        System.out.println("|           ||  |  /      |       |           |   /   \\      /      |       |           | /  __  \\  |  ____|");
        System.out.println("`---|  |----`|  | |  ,----' ______`---|  |----`  /  ^  \\    |  ,----' ______`---|  |----`|  |  |  | |  |__   ");
        System.out.println("    |  |     |  | |  |     |______|   |  |      /  /_\\  \\   |  |     |______|   |  |     |  |  |  | |   __|  ");
        System.out.println("    |  |     |  | |  `----.           |  |     /  _____  \\  |  `----.           |  |     |  `--'  | |  |____ ");
        System.out.println("    |__|     |__| \\______|            |__|    /__/     \\__\\  \\______|           |__|      \\______/  |_______|");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nWelcome to Tic-Tac-Toe\n");
        System.out.println("Press the following keys to start");
    }

    public static void instructions() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" __  .__   __.      _______..___________..______       __    __    ______ .___________. __    ______   .__   __.      _______.");
        System.out.println("|  | |  \\ |  |     /       ||           ||   _  \\     |  |  |  |  /      ||           ||  |  /  __  \\  |  \\ |  |     /       |");
        System.out.println("|  | |   \\|  |    |   (----``---|  |----`|  |_)  |    |  |  |  | |  ,----'`---|  |----`|  | |  |  |  | |   \\|  |    |   (----`");
        System.out.println("|  | |  . `  |     \\   \\        |  |     |      /     |  |  |  | |  |         |  |     |  | |  |  |  | |  . `  |     \\   \\   ");
        System.out.println("|  | |  |\\   | .----)   |       |  |     |  |\\  \\----.|  `--'  | |  `----.    |  |     |  | |  `--'  | |  |\\   | .----)   |   ");
        System.out.println("|__| |__| \\__| |_______/        |__|     | _| `._____| \\______/   \\______|    |__|     |__|  \\______/  |__| \\__| |_______/    ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Instructions:\n");
        System.out.println("So the goal of this game is to get either three X's or O's in a row.");
        System.out.println("Best out of three wins!\n");

        System.out.println("This game board consists of the spaces available to use in the game");
        System.out.println("Space is represented by a digit between [1-9]\n");
        char[][] gameBoardInstructions = {
                {'1', '|', '2', '|', '3'},
                {'-', '+', '-', '+', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '+', '-', '+', '-'},
                {'7', '|', '8', '|', '9'}
        };
        //This would print out the example gameBoard
        for (char[] row : gameBoardInstructions) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("\nTo learn more about our modes press 1 for more instructions.");
        System.out.println("\n1. More Instructions: ");
        System.out.println("-- Press any Int to return");
        System.out.print("\nEnter Your Choice: ");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        if (choice == 1) {
            moreInstructions();
        }
        else {
            welcome();
        }
    }

    public static void moreInstructions() {

        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPress the matching Ints to learn more about each mode \n");

        int choice;
        while (true) {
            System.out.print("1.) Single Player Mode\n");
            System.out.print("2.) Two Player Mode\n");
            System.out.print("3.) Spectator Mode\n");
            System.out.print("4.) Return to Instructions\n");
            System.out.print("\nEnter Your Menu Choice: ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("\n--------------------------------------DESCRIPTION--------------------------------------\n");
                    System.out.print("Single Player Mode: \n");
                    System.out.print("In Single Player Mode, one player will face against a CPU\n");
                    System.out.print("---------------------------------------------------------------------------------------\n\n");
                    break;
                case 2:
                    System.out.print("\n--------------------------------------DESCRIPTION--------------------------------------\n");
                    System.out.print("Two Player Mode: \n");
                    System.out.print("In Two Player Mode, two players will locally go head to head against each other\n");
                    System.out.print("---------------------------------------------------------------------------------------\n\n");
                    break;
                case 3:
                    System.out.print("\n--------------------------------------DESCRIPTION--------------------------------------\n");
                    System.out.print("Spectator Mode: \n");
                    System.out.print("In Spectator Mode, players do need to play, you can watch two CPU's going head to head!\n");
                    System.out.print("---------------------------------------------------------------------------------------\n\n");

                    break;
                case 4:
                    instructions();
                    break;
                default:
                    System.out.println("\nThis is not a valid Menu Option! Please Select Another!!\n");
                    //if inputs do not match cases this will print
                    break;
            }
        }
    }
    ///Citations
    /*
    Random timer for CPUs
    https://stackoverflow.com/questions/13613538/making-thread-sleep-for-random-amount-of-ms
    Thread.sleep((long)(Math.random()*1700));
     */

    //One player v. CPU mode
    public void onePlayer(char[][] gameBoard) throws InterruptedException {
        System.out.println("\n--------------------------------------SINGLE-PLAYER-MODE--------------------------------------\n");


        System.out.print("Enter your name Player 1: ");
        Scanner scanner1 = new Scanner(System.in);
        String player1 = scanner1.nextLine();
        System.out.println("Player 1 is " + player1 + "\n");

        System.out.print("Enter the name of CPU: ");
        Scanner scanner2 = new Scanner(System.in);
        String CPU2 = scanner2.nextLine();
        System.out.println("CPU is " + CPU2 + "\n");

        begin();

        resetGameBoard(gameBoard);
        GameBoard(gameBoard);

        while(true){
            //Player 1's turn
            Scanner scan = new Scanner(System.in);
            System.out.println(player1 + "'s turn, please placement (1-9): ");
            int X = scan.nextInt();
            //To prevent any pieces to over
            while(playerPos1.contains(X) || CPUPos2.contains(X)){
                System.out.println("This is taken! Try Again");
                X = scan.nextInt();
            }

            turn(gameBoard, X, "player1");

            GameBoard(gameBoard);

            String result = winningPatterns();
            if(result.length() > 1){
                System.out.println(result);
                System.out.println(player1 + "'is the winner!");
                winners.add(player1);
                welcome();
                break;
            }



            //CPU's turn in the game within the while loop
            System.out.println(CPU2 + "'s turn, please placement (1-9): ");
            Random rand = new Random();
            Thread.sleep((long)(Math.random()*2000));
            int O = rand.nextInt(9) + 1;
            while(playerPos1.contains(O) || CPUPos2.contains(O)){
                Thread.sleep((long)(Math.random()*1700));
                O = rand.nextInt(9) + 1;
            }
            turn(gameBoard, O, "player2");

            GameBoard(gameBoard);

            result = winningPatterns();
            if(result.length() > 1){
                System.out.println(result);
                System.out.println(CPU2 + "'is the winner!");
                winners.add(CPU2);
                welcome();
                break;
            }

        }
    }

    //This is a method for spectatorMode, i.e. CPU v CPU
    public void spectator(char[][] gameBoard) throws InterruptedException {
        System.out.println("\n--------------------------------------SPECTATOR-MODE--------------------------------------\n");

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the name of CPU 1: ");
        String CPU1 = scanner1.nextLine();
        System.out.println("CPU 1 is " + CPU1 + "\n");

        System.out.print("Enter the name of CPU 2: ");
        Scanner scanner2 = new Scanner(System.in);
        String CPU2 = scanner2.nextLine();
        System.out.println("CPU 2 is " + CPU2 + "\n");

        begin();

        resetGameBoard(gameBoard);
        GameBoard(gameBoard);

        while(true){
            //CPU1's turn
            Random rand = new Random();
            System.out.println(CPU1 + "'s turn, please placement (1-9): ");
            Thread.sleep((long)(Math.random()*2000));
            int X = rand.nextInt(9) + 1;
            while(CPUPos1.contains(X) || CPUPos2.contains(X)){
                Thread.sleep((long)(Math.random()*2700));
                X = rand.nextInt(9) + 1;
            }

            turn(gameBoard, X, "CPU1");

            GameBoard(gameBoard);

            String result = winningPatterns();
            if(result.length() > 1){
                System.out.println(result);
                System.out.println(CPU1 + "'is the winner!");
                winners.add(CPU1);
                welcome();
                break;
            }

            //CPU2's turn in the game within the while loop
            System.out.println(CPU2 + "'s turn, please placement (1-9): ");
            Thread.sleep((long)(Math.random()*2000));
            int O = rand.nextInt(9) + 1;
            while(CPUPos1.contains(O) || CPUPos2.contains(O)){
                Thread.sleep((long)(Math.random()*2700));
                O = rand.nextInt(9) + 1;
            }
            turn(gameBoard, O, "player2");

            GameBoard(gameBoard);

            result = winningPatterns();
            if(result.length() > 1){
                System.out.println(result);
                System.out.println(CPU2 + "'is the winner!");
                winners.add(CPU2);
                welcome();
                break;
            }

        }
    }

    //This is the method for a local 2 player game
    public void twoPlayer(char[][] gameBoard) {
        System.out.println("\n--------------------------------------TWO-PLAYER-MODE--------------------------------------\n");

        System.out.print("Enter your name Player 1: ");
        Scanner scanner1 = new Scanner(System.in);
        String player1 = scanner1.nextLine();
        System.out.println("Player 1 is " + player1 + "\n");

        System.out.print("Enter your name Player 2: ");
        Scanner scanner2 = new Scanner(System.in);
        String player2 = scanner2.nextLine();
        System.out.println("Player 2 is " + player2 + "\n");

        begin();

        resetGameBoard(gameBoard);
        GameBoard(gameBoard);

        while(true){
            //Player 1's turn
            Scanner scan = new Scanner(System.in);
            System.out.println(player1 + "'s turn, please placement (1-9): ");
            int X = scan.nextInt();
            while(playerPos1.contains(X) || playerPos2.contains(X)){
                System.out.println("This is taken! Try Again");
                X = scan.nextInt();
            }
            turn(gameBoard, X, "player1");

            GameBoard(gameBoard);

            String result = winningPatterns();
            if(result.length() > 1){
                System.out.println(result);
                System.out.println(player1 + "'is the winner!");
                winners.add(player1);
                welcome();
                break;
            }



            //Player 2's turn in the game within the while loop
            System.out.println(player2 + "'s turn, please placement (1-9): ");

            int O = scan.nextInt();
            while(playerPos1.contains(O) || playerPos2.contains(O)){
                System.out.println("This is taken! Try Again");
                O = scan.nextInt();
            }
            turn(gameBoard, O, "player2");

            GameBoard(gameBoard);

            result = winningPatterns();
            if(result.length() > 1){
                System.out.println(result);
                System.out.println(player2 + "'is the winner!");
                winners.add(player2);
                welcome();
                break;
            }

        }
    }

    public static void begin() {

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(".______    _______   _______  __  .__   __. ");
        System.out.println("|   _  \\  |   ____| /  _____||  | |  \\ |  | ");
        System.out.println("|  |_)  | |  |__   |  |  __  |  | |   \\|  | ");
        System.out.println("|   _  <  |   __|  |  | |_ | |  | |  . `  | ");
        System.out.println("|  |_)  | |  |____ |  |__| | |  | |  |\\   | ");
        System.out.println("|______/  |_______| \\______| |__| |__| \\__| ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

    }

    //This method would print the gameBoard
    //it has a nested for-loop so this is O(n^2)
    public static void GameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    //This is a method with a Selection Structure type of Control flow
    /*
    The parameter list of this method is the gameBoard, the pos, and the user
    Within the switch case the position of where someone puts their elements change from a clear gameBoard via
    a switch case scenario where it would be place via [ROW][ELEMENTS] from the 2d char array in our gameBoard.
    */
    public void turn(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';

        if (user.equals("player1")||(user.equals("CPU1"))) {
            symbol = 'X';
            playerPos1.add(pos);
            CPUPos1.add(pos);
        } else if (user.equals("player2")||(user.equals("CPU2"))){
            symbol = 'O';
            playerPos2.add(pos);
            CPUPos2.add(pos);
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    //This is the winner's list
    //If there are no winners from starting the game a postive message will print
    //if there are winners they will join in the list
    //in the case of a tie, everyone is a winner so both players are added
    public static void winners() {
        System.out.println("\n--------------------------------------WINNER-LIST--------------------------------------\n");

        Scanner scanner = new Scanner(System.in);
        if (winners.isEmpty()){
            System.out.println("\nWelcome to our Winner's List! \nAs of now there are now new winners yet!");
            System.out.println("Try playing a game to find out if you will be on the list :)");
        }
        else{
            System.out.println("\nPrevious Winners: ");
            for (int i = 0; i < winners.size();i++)
            {
                System.out.println(winners.get(i));
            }
        }
        System.out.println("\n1. Main Menu: ");
        System.out.print("\nEnter Your Choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            welcome();
        }
        else{
            System.out.println("\nThis is not a valid Menu Option! Please Select Another!!\n");
            winners();
        }
    }


        //This would clear all previous marks from the game
    public static void resetGameBoard(char[][] gameBoard) {
        gameBoard[0][0] = ' ';
        gameBoard[0][2] = ' ';
        gameBoard[0][4] = ' ';
        gameBoard[2][0] = ' ';
        gameBoard[2][2] = ' ';
        gameBoard[2][4] = ' ';
        gameBoard[4][0] = ' ';
        gameBoard[4][2] = ' ';
        gameBoard[4][4] = ' ';
    }

    //asList() method of java.util.Arrays class is used to return a fixed-size list backed by the specified array
    //winning conditions
    ///These winning conditions are based off the numerical positions
    // that the placers utilize to place their symbol on the game board

    public String winningPatterns(){
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftColumn = Arrays.asList(1, 4, 7);
        List middleColumn = Arrays.asList(2, 5, 8);
        List rightColumn = Arrays.asList(3, 6, 9);
        List acrossRight = Arrays.asList(1, 5, 9);
        List acrossLeft = Arrays.asList(7, 5, 3);

        //List of list of winning Patterns needed
        List<List> winningList = new ArrayList<List>();
        winningList.add(topRow);
        winningList.add(middleRow);
        winningList.add(bottomRow);
        winningList.add(leftColumn);
        winningList.add(middleColumn);
        winningList.add(rightColumn);
        winningList.add(acrossRight);
        winningList.add(acrossLeft);

        for (List l: winningList){
            if (playerPos1.containsAll(l)){
                return "\nGAME!";
            }
            else if (playerPos2.containsAll(l)){
                return "\nGAME!";
            }
            else if (CPUPos1.containsAll(l)){
                return "\nGAME!";
            }
            else if (CPUPos2.containsAll(l)){
                return "\nGAME!";
            }
            else if (playerPos1.size() + playerPos2.size() == 9){
                return "\nTIE!";
            }
            else if (CPUPos1.size() + CPUPos2.size() == 9){
                return "\nTIE!";
            }
            else if (playerPos1.size() + CPUPos2.size() == 9){
                return "\nTIE!";
            }
        }
        return "";
    }
}
