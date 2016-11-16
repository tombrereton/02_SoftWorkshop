 @Test
 public void testAssertThatHamcrestCoreMatchers() {
  assertThat("good",allOf(equalTo("good"),startsWith("good")));
  assertThat("good",not(allOf(equalTo("bad"),equalTo("good"))));
  assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
  assertThat(7, not(CombinableMatcher.<Integer>
                    either(equalTo(3)).or(equalTo(4))));
  assertThat(new Object(), not(sameInstance(new Object())));
 }

 @Test
 public void testAssertTrue() {
   assertTrue("failure - should be true", true);
 }
}
