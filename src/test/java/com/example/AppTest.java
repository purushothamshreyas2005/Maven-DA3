package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
@Test
public void testAdd() {
App app = new App();
assertEquals(5, app.add(2, 3));
}

@Test
  public void testSub() {
  App app = new App();
  assertEquals(5, app.sub(5,6));
}

  @Test
  public void testMul() {
    App app = new App();
    assertEquals(5, app.mul(9,8));
  }

  @Test
  public void testDiv() {
    App app = new App();
    assertEquals(5, app.div(10,5));
  }
}
