import java.util.ArrayList;

class BitcoinCalculater {

  public ArrayList<Integer> calculate(int[] monetary, int value){
    ArrayList<Integer>  results = new ArrayList<Integer>();
    int i = 0;
    while ( i < monetary.length ){
      value -= monetary[i];
      if (value >= 0){
        results.add(monetary[i]);
      } else {
        value += monetary[i];
        i++;
      }
    }
    if (value == 0){
       return results;
    } else {
      return null;
    }
  }
}

class TestBitcoinCalculater {
  public static void main(String args[]) {
    BitcoinCalculater bitcoin = new BitcoinCalculater();
    int[] input = {20, 10, 5, 1};
    System.out.println(bitcoin.calculate(input, 97));
  }
}
