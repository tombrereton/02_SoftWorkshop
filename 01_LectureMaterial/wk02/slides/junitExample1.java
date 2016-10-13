@Test
  public void assertEqualsTest1() {
    assertEquals("failure in assertEqualsTest1: " +
     " expected string not equal given string",//errorMsg
     "text", //expected value
     "te" + "xt");//actual value
}

@Test
  public void assertEqualsTest2() {
    assertEquals("failure in assertEqualsTest2: " +
     " expected number not approx. equal given number",//errorMsg
     2.0,    //expectedValue
     2.1,    //actualValue
     0.11);  // tolerance >= |expectedValue - actualValue|
}
