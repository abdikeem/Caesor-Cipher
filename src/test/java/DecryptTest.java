import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptTest {
   @Test
    public void getCipherText_givesCipherText_Returns_Text(){
       Decrypt decrypt = new Decrypt();
       decrypt.setCipher("kimza");
       String expeted ="kimza";
       assertEquals(expected,decrypt.getCipher());
   }
@Test
    public void isCipherTextValid_textIsValid_True() {
        Decrypt decrypt = new Decrypt();
        decrypt.setCipher("kimza");
        String testString = decrypt.getCipher();
        assertTrue(decrypt.isCipherString(testString));
    }
    @Test
    public void getKey_givesKey_Returns_Key() {
        Decrypt decrypt = new Decrypt();
        decrypt.setKey(1);
        int testKey = 1;
        assertEquals(testKey, decrypt.getKey());
    }
     @Test
    public void isKeyRangeCorrect_returnsCorrect_True() {
        Decrypt decrypt = new Decrypt();
        decrypt.setKey(1);
        assertTrue(decrypt.isKeyRangeCorrect(1));
    }

}
