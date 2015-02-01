import java.util.Random;

public class RandomPos {
  
  static Random  aRandom = new Random();
  
  public static int randomPosition(int aStart, int aEnd){
    long range = (long)aEnd - (long)aStart + 1;
    long fraction = (long)(range * aRandom.nextDouble());
    int randomNumber =  (int)(fraction + aStart);    
    return randomNumber;
  }
  
  
} 