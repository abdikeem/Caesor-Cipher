import java.util.ArrayList;
import java.util.List;

public class Encrypt {

    //init required variables
    private String text;
    private Integer key;

    //getters and setters
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    //validate that text is a string
    public boolean isTextString(String testString) {
        String pattern = "[a-z]+";
        return testString.matches(pattern);
    }

    //validate that the key is a digit
    public Boolean isKeyValid(int i) throws ClassNotFoundException {
        return Class.forName("java.lang.Integer").isInstance(i);
    }

    //validate that the key is a digit  between 0 and 25 both included
    public boolean isKeyRangeCorrect(int i) {
        return i >= 0 && i <= 25;
    }

    //encrypt text
    static String encryptMessageWithKey(String text, int key) {
        Character[] lc = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Integer> integerList = new ArrayList<>();
        StringBuilder ss = new StringBuilder();
        List<Character> ciphers = new ArrayList<>();
        for (int i = 0; i < text.toLowerCase().length(); i++) {
            for (int i1 = 0; i1 < lc.length; i1++) {
                if (text.charAt(i) == lc[i1]) {
                    Integer shift = (i1 + key) % 26;
                    integerList.add(shift);
                }
            }

            if (text.charAt(i) == ' ') {
                integerList.add(100);
            }
        }

        for (Integer i : integerList) {
            if (i == 100) {
                ciphers.add(' ');
                continue;
            }
            ciphers.add(lc[i]);
        }
        for (Character c : ciphers) {

            ss.append(c.toString());
        }
        return ss.toString();
    }


}
