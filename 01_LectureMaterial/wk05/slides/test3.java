  // JUnit Matchers assertThat
  @Test
  public void testAssertThatBothContainsString() {
    assertThat("albumen",
          both(containsString("a")).and(containsString("b")));
  }

  @Test
  public void testAssertThathasItemsContainsString() {
    assertThat(Arrays.asList("one", "two", "three"),
               hasItems("one", "three"));
  }

  @Test
  public void testAssertThatEveryItemContainsString() {
   assertThat(Arrays.asList(new String[] {"fun", "ban", "net"}),
              everyItem(containsString("n")));
  }
