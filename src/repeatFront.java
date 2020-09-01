public class repeatFront {
  public String repeatFront(String str, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = n; n > 0; n--) {
      result.append(str.substring(0, n));
    }

    return result.toString();
  }
}
// initial solution but StringBuilder is better for loops.
//  public String repeatFront(String str, int n) {
//    String result = "";
//    for (int i = n; n > 0; n--) {
//      result += str.substring(0, n);
//    }
//
//    return result;
//  }