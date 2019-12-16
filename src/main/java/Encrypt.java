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
}
