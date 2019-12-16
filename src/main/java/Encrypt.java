public class Encrypt {
    private String text;
    private Integer key;

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
    public boolean isTextString(String testString) {
        String pattern = "[a-z]+";
        return testString.matches(pattern);
    }

    public Boolean isKeyValid(int i) throws ClassNotFoundException {
        return Class.forName("java.lang.Integer").isInstance(i);
    }

    public boolean isKeyRangeCorrect(int i) {
        return i >= 0 && i <= 25;
    }
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
}
