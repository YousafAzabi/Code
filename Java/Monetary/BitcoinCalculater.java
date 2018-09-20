import java.util.ArrayList;

class BitcoinCalculater {

  public ArrayList<Integer> calculate(){
    int[]  monetary = {20, 10, 5, 1};
    int value = 97;
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
    System.out.println(bitcoin.calculate());
    // ArrayList<Integer> arr = bitcoin.calculate();
    // System.out.print("[ ");
    // for (int i = 0; i < arr.length; i++){
    //   System.out.print(arr[i]);
    //   if(i < (arr.length - 1)) {
    //     System.out.print(", ");
    //   }
    // }
    // System.out.println("]");
  }
}
