//Andriy Zasypkin
//2016-03-15
//Practice 2011 - 03: Password Validation

import java.io.*;

public class Main {
  public static boolean consecutiveChars(String strIn) {
    char cCons = strIn.charAt(0);
    int  nCons = 1;
    for(int i=1; i<strIn.length(); i++) {
      if(strIn.charAt(i) == cCons)
        nCons++;
      else {
        cCons = strIn.charAt(i);
        nCons = 1;
      }
      if(nCons >= 3)
        return true;
    }
    return false;
  }

  public static boolean isPalindrome(String strIn) {
    strIn = strIn.toLowerCase().replaceAll("[^a-z]+", "");
    for(int i=0; i<strIn.length()/2; i++) {
      if(strIn.charAt(i) != strIn.charAt(strIn.length()-i-1))
        return false;
    }
    return true;
  }

  public static boolean isIn(String[] things, String strIn) {
    strIn = strIn.toLowerCase();
    for(String thing : things) {
      thing = thing.toLowerCase();
      if(thing.length() < 1)
        continue;
      int nCounter = 0;
      for(char c : strIn.toCharArray()) {
        if(c == thing.charAt(nCounter))
          nCounter++;
        if(nCounter >= thing.length())
          return true;
      }
    }
    return false;
  }

  public static void main(String[] args) throws IOException {

    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    int nCases = Integer.valueOf(input.readLine());

    for(int i=1; i<=nCases; i++) {
      String strPass = input.readLine();

      if(strPass.length() < 9 || strPass.length() > 20) {
        System.out.println("Invalid Password");
        continue;
      }

      if(strPass.replaceAll("[^a-z]+", "").length() < 2) {
        System.out.println("Invalid Password");
        continue;
      }

      if(strPass.replaceAll("[^A-Z]+", "").length() < 2) {
        System.out.println("Invalid Password");
        continue;
      }

      if(strPass.replaceAll("[^0-9]+", "").length() < 1) {
        System.out.println("Invalid Password");
        continue;
      }

      if(strPass.replaceAll("[^0-9A-Za-z]+", "").length() < 2) {
        System.out.println("Invalid Password");
        continue;
      }

      if(consecutiveChars(strPass)) {
        System.out.println("Invalid Password");
        continue;
      }

      if(isPalindrome(strPass)) {
        System.out.println("Invalid Password");
        continue;
      }

      String[] invalid = {"password", "virginia", "cavalier", "code",
                          "drowssap", "ainigriv", "reilavac", "edoc"};
      if(isIn(invalid, strPass)) {
        System.out.println("Invalid Password");
        continue;
      }

      System.out.println("Valid Password");
    }

    //close stream
    input.close();

    System.exit(0);
  }
}
