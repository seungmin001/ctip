package logic;

import org.junit.Assert;
import org.junit.Test;

public class CNumberManagerTest {

  private CNumberManager CM = new CNumberManager();
  private CNumber Cn = new CNumber(1, 1);

  @Test
  public void testPopCnumber() {
    Cn.setCNumberT(971125);
    CM.addCNumber(Cn);
    int ExpectedResult = Cn.getTitleId();
    int ActualResult = CM.popCNumber(971125);
    Assert.assertEquals(ExpectedResult, ActualResult);
  }

  @Test
  public void testCheckCnumber() {
    Cn.setCNumberT(999999);
    CM.setMNumber(971125);
    CM.addCNumber(Cn);
    int ExpectedResult = 1;
    int ActualResult = CM.checkCNumber(999999);
    Assert.assertEquals(ExpectedResult, ActualResult);
    ExpectedResult = 0;
    ActualResult = CM.checkCNumber(971125);
    Assert.assertEquals(ExpectedResult, ActualResult);
    ExpectedResult = -1;
    ActualResult = CM.checkCNumber(888888);
    Assert.assertEquals(ExpectedResult, ActualResult);
  }

  @Test
  public void testCheckCnumber2() {
    Cn.setCNumberT(999999);
    CM.addChCNumber(Cn);
    boolean ActualResult = CM.checkCNumber2(999999);
    Assert.assertTrue(ActualResult);
    ActualResult = CM.checkCNumber2(888888);
    Assert.assertFalse(ActualResult);
  }

  @Test
  public void testAddCnumber() {
    Cn.setCNumberT(971125);
    CM.addCNumber(Cn);
    int ExpectedResult = 1;
    int ActualResult = CM.getCList().size();
    Assert.assertEquals(ExpectedResult, ActualResult);
  }


  @Test
  public void testAddchCnumber() {
    Cn.setCNumberT(971125);
    CM.addChCNumber(Cn);
    int ExpectedResult = 1;
    int ActualResult = CM.getChCList().size();
    Assert.assertEquals(ExpectedResult, ActualResult);
  }
}