package tddjunitdemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFirst2CharsTest {

  /*TODO  Check List
   * 1)"" =>""
   * 2)"AARR" =>"RR"
   * 3)"ABQWERT"=>"	BQWERT"
   * 4)"BBBBBB"=>"BBBBBB"
   */
      RemoveAFirst2Chars   removeAFirst2Chars;
     @BeforeEach
      void setUp()
      {
    	  removeAFirst2Chars =new RemoveAFirst2Chars();
      }
     @Test
    void testEmptyChars()
    {
    	assertEquals(" ",removeAFirst2Chars.remove(" "));
    }
     @Test
     void test2chars()
     {
    	 assertEquals("RR",removeAFirst2Chars.remove("AARR"));
     }

  
    @Test
    void  testnchars()
    {
    	    	assertEquals("BQWERT",removeAFirst2Chars.remove("ABQWERT"));
    }
    @Test
    void testnoA() {
    	
    	assertEquals("BBBBBBB",removeAFirst2Chars.remove("BBBBBBB"));
    }
	
	

}
