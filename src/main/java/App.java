public class App{
    private int key;

    /*
    private final char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                                  'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                                  'U', 'V', 'W', 'X', 'Y', 'Z'};
    */


    public App(int key) {
        this.key = key;
    }
    public String encrypt(String plainText) {
        String enc = "";
        for (int i = 0; i < plainText.length(); i++){
            char ch = (char)(plainText.codePointAt(i) + key);
            //char ch = (char)((plainText.codePointAt(i) + key) % 26);
            enc += ch;
        }
        return enc;
    }
    public String decrypt(String cipherText) {
        String dec = "";
        for (int i = 0; i < cipherText.length(); i++){
            char ch = (char)(cipherText.codePointAt(i) - key);
            //char ch = (char)((cipherText.codePointAt(i) - key) % 26);
            dec += ch;
        }
        return dec;
    }
}

