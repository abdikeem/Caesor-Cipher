import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int key = -1;
        String repeat = "1";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String keyString;

        Encrypt encrypt = new Encrypt();

        System.out.println("Encryption");

        while (repeat.equals("1")) {
            System.out.println("------------------------------");
            System.out.println("Enter string to encode");
            String userInput = bufferedReader.readLine();

            System.out.println("Enter key to encrypt the text");
            keyString = bufferedReader.readLine();

            try {
                key = Integer.parseInt(keyString);
            } catch (NumberFormatException e) {
                System.out.println("Input a digit key");
            }

            if (encrypt.isKeyValid(key) && encrypt.isKeyRangeCorrect(key)) {
                System.out.println("----------------------");
                String prefix = "Your encoded string is ::";
                System.out.println(prefix);

                String cipherText = (Encrypt.encryptMessageWithKey(userInput.toLowerCase(), key));
                System.out.println(cipherText);

                String text = Decrypt.decryptMessageWithKey(cipherText, key);
                System.out.println();
                System.out.println("Your text was ::");
                System.out.println(text);

                System.out.println();
                System.out.println("To continue enter 1 , to exit enter any other key");
                repeat = bufferedReader.readLine();

            }

            else {
                System.out.println("Please enter a digit key between 0 and 25 ");
                keyString = bufferedReader.readLine();
                try {
                    key = Integer.parseInt(keyString);
                } catch (NumberFormatException e) {
                    System.out.println("Input a digit key");
                }

                if (encrypt.isKeyValid(key) && encrypt.isKeyRangeCorrect(key)) {
                    System.out.println("----------------------");
                    String prefix = "Your encoded string is::";
                    System.out.println(prefix);
                    String cipherText = (Encrypt.encryptMessageWithKey(userInput.toLowerCase(), key));
                    System.out.println(cipherText);

                    String text = Decrypt.decryptMessageWithKey(cipherText, key);
                    System.out.println();
                    System.out.println("Your text was ::");
                    System.out.println(text);
                    System.out.println();

                }

                else {
                    System.out.println("Program is exiting ....");
                    System.exit(0);
                }
            }
        }
    }
}