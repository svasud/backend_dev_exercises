import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        new Game().start();
    }

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int points; //0 (typ prymitywny)

    public void start(){
        long startTime = System.currentTimeMillis();

        while (true) {
            char radomChar = (char) (random.nextInt(123 - 97) + 97);//97,122
            System.out.println("Twój znak to " + radomChar);

            System.out.println("Podaj swoją odpowiedź: ");
            char userAnswer = scanner.nextLine().charAt(0);
            if (radomChar == userAnswer) {
                points++;
            }else{
                break;
            }
            if (points == 10){
                break;
            }
        }

        long stopTime = System.currentTimeMillis();
        System.out.println("Twój wynik to: " +points + " a czas gry:" + (stopTime - startTime) / 1000);
    }
}
