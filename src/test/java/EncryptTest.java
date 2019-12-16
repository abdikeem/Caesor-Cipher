import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EncryptTest {

    @Test
    public void getText_givesText_Returns_Text() {
        Encrypt encrypt = new Encrypt();
        encrypt.setText("text");
        String expected = "text";
        assertEquals(expected, encrypt.getText());
    }

     @Test
    public void isTextValid_textIsValid_True() {
        Encrypt encrypt = new Encrypt();
        encrypt.setText("text");
        String testString = encrypt.getText();
        assertTrue(encrypt.isTextString(testString));
    }

    @Test
    public void getKey_givesKey_Returns_Key() {
        Encrypt encrypt = new Encrypt();
        encrypt.setKey(1);
        int testKey = 1;
        assertEquals(testKey, encrypt.getKey());
    }

    @Test
    public void isKeyValid_textIsIsValid_True() throws ClassNotFoundException {
        Encrypt encrypt = new Encrypt();
        encrypt.setKey(1);
        assertEquals(true, encrypt.isKeyValid(1));
    }

    @Test
    public void isKeyRangeCorrect_returnsCorrect_True() {
        Encrypt encrypt = new Encrypt();
        encrypt.setKey(1);
        assertTrue(encrypt.isKeyRangeCorrect(1));
    }

    @Test
    public void encryptMessageWithKey_charA_WithKey1_returnsB() {
        Encrypt encrypt = new Encrypt();
        String expected = "c";
        encrypt.setKey(1);
        encrypt.setText("d");
        assertEquals(expected, Encrypt.encryptMessageWithKey(encrypt.getText(), encrypt.getKey()));
    }

    @Test
    public void encryptMessageWithKey_StringHello_WithKey10_returns(){
        Encrypt encrypt = new Encrypt();
        String expected = "ewelcom";
        encrypt.setKey(10);
        encrypt.setText("welcome");
        assertEquals(expected, Encrypt.encryptMessageWithKey(encrypt.getText(), encrypt.getKey()));
    }

}