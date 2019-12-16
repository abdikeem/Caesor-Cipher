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

}
