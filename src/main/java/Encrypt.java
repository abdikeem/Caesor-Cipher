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
}
