public class TestWordStemmer {
  public void testStemmer() {
    WordStemmer stemmer = new WordStemmer ();
    assert stemmer.stem("helping") == "help";
    assert stemmer.stem("hungrily") == "hungry";
    assert stemmer.stem("friendliness") == "friend";
    assert stemmer.stem("play") == "play";
    assert stemmer.stem("playing") == "play";
    assert stemmer.stem("player") == "play";
    // ...
  }
}
