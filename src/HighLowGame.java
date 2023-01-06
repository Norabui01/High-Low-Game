import java.util.*;

public class HighLowGame {
    public static void main(String[] args) {
        //This first part is just for dice rolls face drawing, I want drawing those first
        //So I don't have to draw later.
        String dice_roll_face_1 = "        ___________ " + "\n" +
                                  "       /          /|" + "\n" +
                                  "      /    ()    / |" + "\n" +
                                  "     /__________/()|" + "\n" +
                                  "     | ()       |()|" + "\n" +
                                  "     |    ()    | / " + "\n" +
                                  "     |       () |/  " + "\n" +
                                  "     ------------   " + "\n" +
                                  "           1        " + "\n";
        String dice_roll_face_2 = "        ___________ " + "\n" +
                                  "       /          /|" + "\n" +
                                  "      /  ()  ()  / |" + "\n" +
                                  "     /__________/  |" + "\n" +
                                  "     | ()       |()|" + "\n" +
                                  "     |    ()    | / " + "\n" +
                                  "     |       () |/  " + "\n" +
                                  "     ------------   " + "\n" +
                                  "           2        " + "\n";
        String dice_roll_face_3 = "        ___________ " + "\n" +
                                  "       / ()       /|" + "\n" +
                                  "      /    ()    / |" + "\n" +
                                  "     /_______()_/()|" + "\n" +
                                  "     | ()    () |()|" + "\n" +
                                  "     |    ()    | / " + "\n" +
                                  "     | ()    () |/  " + "\n" +
                                  "     ------------   " + "\n" +
                                  "           3        " + "\n";
        String dice_roll_face_4 = "        ___________ " + "\n" +
                                  "       / ()    () /|" + "\n" +
                                  "      /          / |" + "\n" +
                                  "     /_()____()_/()|" + "\n" +
                                  "     | ()       |()|" + "\n" +
                                  "     |    ()    | / " + "\n" +
                                  "     |       () |/  " + "\n" +
                                  "     ------------   " + "\n" +
                                  "           4        " + "\n";
        String dice_roll_face_5 = "        ___________ " + "\n" +
                                  "       / ()    () /|" + "\n" +
                                  "      /    ()    / |" + "\n" +
                                  "     /_()____()_/  |" + "\n" +
                                  "     | ()       |()|" + "\n" +
                                  "     |    ()    | / " + "\n" +
                                  "     |       () |/  " + "\n" +
                                  "     ------------   " + "\n" +
                                  "           5        " + "\n";
        String dice_roll_face_6 = "        ___________ " + "\n" +
                                  "       / ()    () /|" + "\n" +
                                  "      / ()    () / |" + "\n" +
                                  "     /_()____()_/()|" + "\n" +
                                  "     | ()    () |()|" + "\n" +
                                  "     |    ()    | / " + "\n" +
                                  "     | ()    () |/  " + "\n" +
                                  "     ------------   " + "\n" +
                                  "           6        " + "\n";

        //The main game start from here, this is prompt introduction to the game part.
        String prompt = "\nWelcome to High_Low game! You are playing this game with the computer.";
        prompt += "\nThis is the instruction for you to play this game.";
        prompt += "\nFirst of all, this program will simulate the throw of 5 dices for you. It will automatically roll for you.";
        prompt += "\nThen it is the computer's turn to roll but you cannot see its roll.";
        prompt += "\nThen, you have to guess if the sum of your 5 dices is higher or lower than the sum of computer's dices";
        prompt += "\nIf you think yours is higher, enter letter 'h' or 'H'";
        prompt += "\nIf you think yours is lower, enter letter 'l' or 'L'";
        prompt += "\nIf your guess is right then you win, else you lose. Ready? Below is your throw: \n";
        System.out.println(prompt);

        while (true) {

            Random ranGen = new Random();

            //simulation of user dices.
            int user_dice_1 = ranGen.nextInt(6) + 1;
            int user_dice_2 = ranGen.nextInt(6) + 1;
            int user_dice_3 = ranGen.nextInt(6) + 1;
            int user_dice_4 = ranGen.nextInt(6) + 1;
            int user_dice_5 = ranGen.nextInt(6) + 1;

            int sum_user_throw = user_dice_1 + user_dice_2 + user_dice_3 + user_dice_4 + user_dice_5;

            String prompt_user = "You rolled the following values: " + "\n" +
                    "die 1 ---> " + user_dice_1 + "\n" +
                    "die 2 ---> " + user_dice_2 + "\n" +
                    "die 3 ---> " + user_dice_3 + "\n" +
                    "die 4 ---> " + user_dice_4 + "\n" +
                    "die 5 ---> " + user_dice_5 + "\n" +
                    "Which totals to " + sum_user_throw;
            System.out.println(prompt_user);

            //Here, dice art display for user roll.
            String dice_art_1 = dice_roll_face_1; // This is just for initialize value for each dice art.
            String dice_art_2 = dice_roll_face_1;
            String dice_art_3 = dice_roll_face_1;
            String dice_art_4 = dice_roll_face_1;
            String dice_art_5 = dice_roll_face_1;

            //from here, this is for matching each dice art of each user dice roll with each dice roll face.
            switch (user_dice_1) {
                case 1:
                    dice_art_1 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_1 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_1 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_1 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_1 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_1 = dice_roll_face_6;
                    break;
            }
            switch (user_dice_2) {
                case 1:
                    dice_art_2 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_2 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_2 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_2 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_2 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_2 = dice_roll_face_6;
                    break;
            }
            switch (user_dice_3) {
                case 1:
                    dice_art_3 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_3 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_3 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_3 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_3 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_3 = dice_roll_face_6;
                    break;
            }
            switch (user_dice_4) {
                case 1:
                    dice_art_4 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_4 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_4 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_4 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_4 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_4 = dice_roll_face_6;
                    break;
            }
            switch (user_dice_5) {
                case 1:
                    dice_art_5 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_5 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_5 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_5 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_5 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_5 = dice_roll_face_6;
                    break;
            }

            System.out.println("\nYou rolled: ");

            int index = 0;
            for(int line = 0; line < 9; line++) {
                System.out.println(dice_art_1.substring(index, index + 20) +
                        dice_art_2.substring(index, index + 20) +
                        dice_art_3.substring(index, index + 20) +
                        dice_art_4.substring(index, index + 20) +
                        dice_art_5.substring(index, index + 20));
                index += 21;
            }
            // dice art user roll part finished.

            //prompt user guess.
            Scanner keyBoard = new Scanner(System.in);
            prompt_user = "\nPlease enter H or h if you think your roll will be higher or\n" +
                    "             L or l if you think your roll will be lower\n" +
                    "---> ";
            System.out.print(prompt_user);

            String user_guess = keyBoard.nextLine();

            //simulation of computer roll.
            int comp_dice_1 = ranGen.nextInt(6) + 1;
            int comp_dice_2 = ranGen.nextInt(6) + 1;
            int comp_dice_3 = ranGen.nextInt(6) + 1;
            int comp_dice_4 = ranGen.nextInt(6) + 1;
            int comp_dice_5 = ranGen.nextInt(6) + 1;

            int sum_comp_throw = comp_dice_1 + comp_dice_2 + comp_dice_3 + comp_dice_4 + comp_dice_5;

            prompt = "\nThe computer rolled the following values: " + "\n" +
                    "die 1 ---> " + comp_dice_1 + "\n" +
                    "die 2 ---> " + comp_dice_2 + "\n" +
                    "die 3 ---> " + comp_dice_3 + "\n" +
                    "die 4 ---> " + comp_dice_4 + "\n" +
                    "die 5 ---> " + comp_dice_5 + "\n" +
                    "Which totals to " + sum_comp_throw;
            System.out.println(prompt);

            // dice art display for computer roll.
            switch (comp_dice_1) {
                case 1:
                    dice_art_1 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_1 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_1 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_1 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_1 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_1 = dice_roll_face_6;
                    break;
            }
            switch (comp_dice_2) {
                case 1:
                    dice_art_2 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_2 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_2 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_2 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_2 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_2 = dice_roll_face_6;
                    break;
            }
            switch (comp_dice_3) {
                case 1:
                    dice_art_3 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_3 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_3 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_3 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_3 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_3 = dice_roll_face_6;
                    break;
            }
            switch (comp_dice_4) {
                case 1:
                    dice_art_4 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_4 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_4 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_4 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_4 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_4 = dice_roll_face_6;
                    break;
            }
            switch (comp_dice_5) {
                case 1:
                    dice_art_5 = dice_roll_face_1;
                    break;
                case 2:
                    dice_art_5 = dice_roll_face_2;
                    break;
                case 3:
                    dice_art_5 = dice_roll_face_3;
                    break;
                case 4:
                    dice_art_5 = dice_roll_face_4;
                    break;
                case 5:
                    dice_art_5 = dice_roll_face_5;
                    break;
                case 6:
                    dice_art_5 = dice_roll_face_6;
                    break;
            }
            System.out.println("\nComputer rolled: ");

            index = 0;
            for(int line = 0; line < 9; line++) {
                System.out.println(dice_art_1.substring(index, index + 20) +
                        dice_art_2.substring(index, index + 20) +
                        dice_art_3.substring(index, index + 20) +
                        dice_art_4.substring(index, index + 20) +
                        dice_art_5.substring(index, index + 20));
                index += 21;
            }

            // dice art for computer roll finished.

            // result of guessing.
            if (sum_user_throw > sum_comp_throw) {
                switch (user_guess) {
                    case "h":
                    case "H":
                        System.out.println("\nYou called \"higher\" correctly and you win!");
                        break;
                    case "l":
                    case "L":
                        System.out.println("\nYou called \"lower\" wrongly and you lost!");
                        break;
                    default:
                        System.out.println("\nInvalid answer.");
                }
            } else if (sum_user_throw < sum_comp_throw) {
                switch (user_guess) {
                    case "h":
                    case "H":
                        System.out.println("\nYou called \"higher\" wrongly and you lost!");
                        break;
                    case "l":
                    case "L":
                        System.out.println("\nYou called \"lower\" correctly and you win!");
                        break;
                    default:
                        System.out.println("\nInvalid answer.");
                }

            } else {
                System.out.println("\nThe sum of your dices and computer's is equal so it is Draw!");
            }
            String replay_prompt = "\nDo you like to play again? Please enter any letter to replay or \"No\" to quit: ";
            System.out.print(replay_prompt);

            String user_replay = keyBoard.nextLine();
            if (user_replay.equalsIgnoreCase("No")){
                break;
            }
        }

        System.out.println("Game end! You have a nice day!");

    }
}

