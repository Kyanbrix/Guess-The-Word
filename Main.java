package Program;

import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class Main {

    public static Main getMain() {
        return main;
    }

    ScheduledExecutorService service = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
    private static Main main;

    public String getGreet(String name) {
        return "Hello " + name;
    }

    public Main() {

        main = this;

        System.out.println(Runtime.getRuntime().availableProcessors());

    }

    public static void main(String[] args) {



//        String phrase = "Bard";
//        int lives = 5;
//        int phraseLength = phrase.length();
//
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int howManyBlankSpace = random.nextInt(2, phraseLength);
//
//        char[] letters = phrase.toCharArray();
//
//
//        int i = 0;
//
//        while (i < howManyBlankSpace) {
//
//            int indexToChange = random.nextInt(phraseLength);
//
//            if (letters[indexToChange] == ' ') continue;
//
//            letters[indexToChange] = '_';
//
//            i++;
//        }
//
//
//        System.out.println("Word to guess: " + String.valueOf(letters));
//
//        ArrayList<Integer> indexGuess = new ArrayList<>();
//
//
//        while (true) {
//
//            if (lives == 0) {
//                System.out.println("You lose moron fker retard");
//                break;
//            }
//
//            if (!Arrays.toString(letters).contains(Character.toString('_'))) {
//
//                System.out.println("Congratulations Retard!!");
//
//                break;
//            }
//
//            String answer = scanner.nextLine().toLowerCase();
//
//
//            if (phrase.contains(Character.toString(answer.charAt(0)))) {
//
//                for (int index = 0; index < phrase.length(); index++) {
//
//                    if (phrase.charAt(index) == answer.charAt(0)) {
//
//                        indexGuess.add(index);
//                    }
//                }
//
//                for (Integer guess : indexGuess) {
//                    letters[guess] = answer.charAt(0);
//                }
//
//                indexGuess.clear();
//
//                System.out.println("Word to Guess: " + String.valueOf(letters));
//
//            } else {
//                System.out.println("XXX Wrong Moron");
//                lives--;
//            }
//
//        }


    }

}
