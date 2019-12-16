public class Decrypt {
    private String cipherText;
    private int key;

    public void setCipher(String cipherText) {
        this.cipherText = cipherText;
    }
    public String getCipher() {
        return this.cipherText;
    }


    public void setKey(int key) {
        this.key = key;
    }
    public int getKey() {
        return this.key;
    }


    public boolean isCipherString(String testString) {
        return testString.toLowerCase().matches("[a-z]+");
    }
    public boolean isKeyValid(int key) throws ClassNotFoundException {
        return Class.forName("java.lang.Integer").isInstance(key);
    }

    public boolean isKeyRangeCorrect(int key) {
        return key >= 0 && key <= 25;
    }

    public static String decryptMessageWithKey(String cipher, int key) {
        char[] cipherChars = cipher.toCharArray();
        char ch;
        String text = "";
        for (int i = 0; i < cipher.length(); i++) {
            if (Character.isLetter(cipherChars[i])) {
                if (((int) cipherChars[i] - key < 97)) {
                    ch = (char) (((int) cipherChars[i] - key - 97 + 26) % 26 + 97);
                } else {
                    ch = (char) (((int) cipherChars[i] - key - 97) % 26 + 97);
                }
                text = text + ch;
            } else if (cipherChars[i] == ' ') {
                text = text + cipherChars[i];
            }
        }
        return text;
    }

}
