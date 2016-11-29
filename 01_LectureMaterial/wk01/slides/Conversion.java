/** Conversion of Temperatures. Definition of static methods.
 *
 *  Obviously before we can implement a conversion we need to KNOW
 *  how the different temperatures are converted into each other:
 *
 *  Fahrenheit to Celsius : celsius    = (fahrenheit − 32) / 1.8;
 *  Celsius to Fahrenheit : fahrenheit = (celsius * 1.8) + 32;
 *
 *  With this we can directly convert single values. What we now want
 *  to have is a general method to do this conversion so that we can
 *  give it the temperature in one system as an argument.
 *  
 *  This can be done by so-called `static methods'
 *  They have the following syntax:
 *  <pre>
 *  public static double Fahrenheit2Celsius(double fahrenheit) {
 *      return (fahrenheit - 32) / 1.8;
 *  }
 *  </pre>

 *  In this particular case `fahrenheit' is a parameter and the
 *  preceeding `double' its type, the `double' between `static' and
 *  `Fahrenheit2Celsius' is the return type, that is, the type of the
 *  value that the method gives back, that is, in this case again a
 *  double. You can read it: The method Fahrenheit2Celsius promises to
 *  return a value of type double if you give it as argument a value
 *  of type double. In order that it can do that it body of the method
 *  (that is, the part between `{' and `}') needs to contain at least
 *  one `return' statement, that is, an expression where this value is
 *  actually given back.
 *
 *  [The meaning of `public' and `static' will be explained in later
 *   weeks.]
 *
 *  Likewise, we define a static method to convert Celsius values into
 *  Fahrenheit values.
 *
 *  @author  Manfred Kerber
 *  @version 2014-09-29
 */


public class Conversion { 
    public static double Fahrenheit2Celsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double Celsius2Fahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static void main(String[] args) {
        System.out.println(Fahrenheit2Celsius(0));
        System.out.println(Fahrenheit2Celsius(100));
        System.out.println(Celsius2Fahrenheit(0));
        System.out.println(Celsius2Fahrenheit(20));
   }
}
