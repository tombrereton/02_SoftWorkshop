int[] a = {1, 2, 3, 4};
int[] b = {1, 2, 3, 5};
@Test
    public void assertEqualArrayTest() {
    assertArrayEquals(" failure in assertArrayEqualsTest", 
                      a,
                      b);
}
