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
}
