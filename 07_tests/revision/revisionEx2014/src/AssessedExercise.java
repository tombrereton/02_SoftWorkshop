public class AssessedExercise extends Exercise {
    private int maximalMarks;

    public AssessedExercise(String difficulty, String text, int maximalMarks) {
        super(difficulty, text, maximalMarks);
//        this.maximalMarks = maximalMarks;
    }

    public String toString() {
        return super.toString() + " Marks is " + getMaximalMarks() + ".";
    }

//    public int getMaximalMarks() {
//        return maximalMarks;
//    }

    public static void main(String[] args) {
        AssessedExercise a = new AssessedExercise("A", "dsjnj", 2);
        System.out.println(a);
    }
}