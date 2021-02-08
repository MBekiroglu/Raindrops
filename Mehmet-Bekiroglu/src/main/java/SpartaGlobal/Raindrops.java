package SpartaGlobal;

public class Raindrops {

  public String RaindropWriter(int inputNum) {
    boolean isRainDrop = false;
    String rainDropWriter = "";

    for (int i = 1; i <= inputNum; i++) {
      if (factorChecker(inputNum, i)) {
        if (i == 3) {
          rainDropWriter += "Pling";
          isRainDrop = true;
        }
        else if (i == 5) {
          rainDropWriter += "Plang";
          isRainDrop = true;
        }
        else if (i == 7) {
          rainDropWriter += "Plong";
          isRainDrop = true;
        }
        else if (i == inputNum && !isRainDrop){
          rainDropWriter += Integer.toString(inputNum);
        }
      }
    }
    return rainDropWriter;
  }

  public boolean factorChecker(int inputNum, int position) {
    if (inputNum % position == 0) {
      return true;
    }
    return false;
  }
}
