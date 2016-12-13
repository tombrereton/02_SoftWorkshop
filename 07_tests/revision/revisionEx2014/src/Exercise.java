public class Exercise {
    private String difficulty;
    private String text;
    private int maximalMarks;

    public int getMaximalMarks() {
        return maximalMarks;
    }

    public Exercise(String difficulty, String text, int maximalMarks) {
        this.difficulty = difficulty;
        this.text = text;
        this.maximalMarks = maximalMarks;
    }


    String getDifficulty() {
        return difficulty;
    }

    String getText() {
        return text;
    }

    public String toString() {
        return String.format("Exercise (%s):\n%s",
                getDifficulty(), getText());
    }
}