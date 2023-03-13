package USTBATCHNO3.Testng;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConstructionSamudhraTest {
	
      @Test
      public void Construction(){
    	  int expected =2000;
    
    	  Price p1=new Price("Hyderabad", 2000, 900);
    	  String city="Hyderabad";
    	  List<Price> details=Arrays.asList(p1);
    	  int ch=1,sq=1;
    	  
    	  Assert.assertEquals(expected, ConstructionSamudhra.construction(details, ch, city, sq));
    	  ch=2;
    	  
    	  expected=900;
    	  Assert.assertEquals(expected, ConstructionSamudhra.construction(details, ch, city, sq));
    	  
      }
}



