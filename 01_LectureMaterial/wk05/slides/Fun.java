import java.util.function.Function;
public class FunMain {
  public static void printN(Function<Integer,Integer> f, int n){
      for (int i = 0; i <= n; i++){
          System.out.print(f.apply(i) + " ");
      }
      System.out.println();
  }
  public static final Function<Integer,Integer> f0 =
      x -> {return x * x + x - 7;};
  public static void main(String[] args) {
      printN(x -> {return x * x;}, 10);
      printN(x -> {return x + 1;}, 10);
      printN(f0, 10);
  }
}
