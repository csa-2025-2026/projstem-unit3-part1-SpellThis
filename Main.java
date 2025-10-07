import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle r1 = new Rectangle(3.2, 5.8); // a rectangle measuring 3.2 by 5.8 

// a rectangle measuring 5.8 by 3.2
Rectangle r2 = new Rectangle(5.8,3.2);

boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength()); // this is refering to if length and width from both of the rectangles are the same
// || - Logical OR
// r1.equals(r2)

boolean isCongruent = isRotated || r1.equals(r2); // refering to both are the same wheater or not they both equal each even if the roated 90 degerees from one another


double widthRatio = r1.getWidth() / r2.getWidth();
double lengthRatio = r1.getlegth() / r2.getlegth();

boolean ratiosAreSame = widthratio == lengthRatio;
boolean isSimilar = isCongruent || ratiosAreSame; // this is comparing if they congruent using the ratios of length and width

  }
}
