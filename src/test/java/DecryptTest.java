import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    //Test the cipherText getter.
    @Test
    public void getCipherText_givesCipherText_Returns_Text() {
        Decrypt decrypt = new Decrypt();
        decrypt.setCipher("ppsshh");
        String expected = "ppsshh";
        assertEquals(expected, decrypt.getCipher());
    }

    //Test that the text provided is of type String
    @Test
    public void isCipherTextValid_textIsValid_True() {
        Decrypt decrypt = new Decrypt();
        decrypt.setCipher("ppsshh");
        String testString = decrypt.getCipher();
        assertTrue(decrypt.isCipherString(testString));
    }

    //Test Key getter
    @Test
    public void getKey_givesKey_Returns_Key() {
        Decrypt decrypt = new Decrypt();
        decrypt.setKey(1);
        int testKey = 1;
        assertEquals(testKey, decrypt.getKey());
    }

    //Test key is a digit
    @Test
    public void isKeyValid_textIsIsValid_True() throws ClassNotFoundException {
        Decrypt decrypt = new Decrypt();
        decrypt.setKey(1);
        assertTrue(decrypt.isKeyValid(1));
    }

    //Test key is between 0 to 25 both 0 and 25 included
    @Test
    public void isKeyRangeCorrect_returnsCorrect_True() {
        Decrypt decrypt = new Decrypt();
        decrypt.setKey(1);
        assertTrue(decrypt.isKeyRangeCorrect(1));
    }

    //Test base case of caesar cipher decryption
    @Test
    public void decryptMessageWithKey_charB_WithKey1_returnsA() {
        Decrypt decrypt = new Decrypt();
        String expected = "c";
        decrypt.setKey(1);
        decrypt.setCipher("d");
        assertEquals(expected, Decrypt.decryptMessageWithKey(decrypt.getCipher(), decrypt.getKey()));
    }

    //Test a random case
    @Test
    public void encryptMessageWithKey_StringHello_WithKey10_returns(){
        Decrypt decrypt = new Decrypt();
        String expected = "welcome";
        decrypt.setKey(10);
        decrypt.setCipher("ewelcom");
        assertEquals(expected, Decrypt.decryptMessageWithKey(decrypt.getCipher(), decrypt.getKey()));
    }


}