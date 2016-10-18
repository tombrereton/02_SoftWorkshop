@Test
  public void assertEqualsTest1() {
    assertEquals("failure in assertEqualsTest1: " +
     " expected string not equal given string",//errorMsg
     "text", //expected value
     "text");//actual value
}

@Test
  public void assertEqualsTest2() {
    assertEquals("failure in assertEqualsTest2: " +
     " expected string not equal given string",//errorMsg
     2.0,    //expectedValue
     2.1,    //actualValue
     0.11);  // tolerance < |expectedValue - actualValue|
}

@Test
  public void assertFalseTest() {
    assertFalse("failure in assertFalseTest: " +
                " expected false but got true", false);
}

@Test
  public void assertTrueTest() {
    assertTrue("failure in assertTrueTest: " +
               "expected true but got false", true);
}
