package javabasics;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertion {
   String message = "Manisha";
   MessageUtil messageUtil = new MessageUtil();

   @Test
   public void testPrintMessage() {
      Assert.assertEquals("spot"messageUtil.testPrintMessage(),message);
   }
}