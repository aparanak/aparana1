package newtours;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dp {
  @Test(dataProvider = "dp")
  public void f(Integer n, Integer s) {
	  System.out.println(n+" "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 20 },
      new Object[] { 20, 30 },
    };
  }
}
