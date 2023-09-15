import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String question = "Who was the creator of Java?";
        List<String> alternatives = new ArrayList<>();

        alternatives.add("Bill Gates");
        alternatives.add("James Gosling");
        alternatives.add("Steve Jobs");
        alternatives.add("Elon Musk");
        alternatives.add("Jeff Bezos");

        String correctAnswer = "James Gosling";

        boolean correctResponse = false;

        do {
            Collections.shuffle(alternatives);

            for (int i = 0; i < alternatives.size(); i++) {
                System.out.println("[" + i + "] " + alternatives.get(i));
            }

            System.out.print("Enter your answer (0-" + (alternatives.size() - 1) + "): ");
            String response = scanner.nextLine();
            
            try {
                int responseInt = Integer.parseInt(response);

                if (responseInt >= 0 && responseInt < alternatives.size()) {
                    String responseValue = alternatives.get(responseInt);

                    if (responseValue.equalsIgnoreCase(correctAnswer)) {
                        System.out.println("Correct answer!");
                        correctResponse = true;
                    } else {
                        System.out.println("Wrong answer! Try again.");
                    }
                } else {
                    System.out.println("Invalid choice. Choose a number from 0 to " + (alternatives.size() - 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid number.");
            }

        } while (!correctResponse);

        // Mensagem de encerramento
        System.out.println("Congratulations! You've completed the quiz.");
        scanner.close();
    }
}
