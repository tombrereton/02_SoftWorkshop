in Date.java:
public Date(int day, String month, int year) {
    if (admissible(day, month, year)) {
        this.day = day; ...
    } else {
        throw new
            IllegalArgumentException("Invalid date in Date");
    }
}

in DateTest.java:
@Rule public ExpectedException exception =
             ExpectedException.none();
@Test public void dateTest9() {
    exception.expect(IllegalArgumentException.class);
    exception.expectMessage("Invalid date in Date");
    new Date(31, "April", 2016);   
}
