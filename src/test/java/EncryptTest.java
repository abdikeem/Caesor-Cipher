import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EncryptTest {

    //Test text getter
    @Test
    public void getText_givesText_Returns_Text() {
        Encrypt encrypt = new Encrypt();
        encrypt.setText("text");
        String expected = "text";
        assertEquals(expected, encrypt.getText());
    }

    //Test that the text provided is a String
    @Test
    public void isTextValid_textIsValid_True() {
        Encrypt encrypt = new Encrypt();
        encrypt.setText("text");
        String testString = encrypt.getText();
        assertTrue(encrypt.isTextString(testString));
    }

    //Test Key getter
    @Test
    public void getKey_givesKey_Returns_Key() {
        Encrypt encrypt = new Encrypt();
        encrypt.setKey(1);
        int testKey = 1;
        assertEquals(testKey, encrypt.getKey());
    }

    //Test key is a number
    @Test
    public void isKeyValid_textIsIsValid_True() throws ClassNotFoundException {
        Encrypt encrypt = new Encrypt();
        encrypt.setKey(1);
        assertEquals(true, encrypt.isKeyValid(1));
    }

    //Test key is between 0 to 25
    @Test
    public void isKeyRangeCorrect_returnsCorrect_True() {
        Encrypt encrypt = new Encrypt();
        encrypt.setKey(1);
        assertTrue(encrypt.isKeyRangeCorrect(1));
    }

    //Test base case of caesar cipher
    @Test
    public void encryptMessageWithKey_charA_WithKey1_returnsB() {
        Encrypt encrypt = new Encrypt();
        String expected = "b";
        encrypt.setKey(1);
        encrypt.setText("a");
        assertEquals(expected, Encrypt.encryptMessageWithKey(encrypt.getText(), encrypt.getKey()));
    }

    Test a random case

    public void encryptMessageWithKey_StringHello_WithKey10_returns(){
        Encrypt encrypt = new Encrypt();
        String expected = "govmywo";
        encrypt.setKey(10);
        encrypt.setText("welcome");
        assertEquals(expected, Encrypt.encryptMessageWithKey(encrypt.getText(), encrypt.getKey()));
    }

}