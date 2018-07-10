package controller;

public class Swingy {

    public static void main(String[] args) {

        SwingController play = new SwingController();

        if (args.length != 1) {
            System.out.println("Error: You need to pass one argument to the game");
        }

        Character mode = args[0].toLowerCase().equals("cli") ? 'A' : (args[0].toLowerCase().equals("gui")  ? 'B' : 'C');
        try {
            switch (mode) {
                case 'A' :
                    System.out.println("Game Mode: Terminal mode [cli]");
                    System.out.println("Welcome to Swingy - A world of the unknown");
                    play.start(mode);
                    break ;
                case 'B' :
                    System.out.println("Game Mode: Graphical mode [gui]");
                    System.out.println("Welcome to Swingy - A world of the unknown");
                    play.start(mode);
                    break ;
                default :
                    System.out.println("Error: argument name must either be cli or gui");
                    break ;
            }
        } catch (IndexOutOfBoundsException gm) {
            System.out.println("Error: incorrect argument description" + gm.getMessage());
            return ;
        }
    }
}
