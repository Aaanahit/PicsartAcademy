import java.util.Arrays;
import java.util.Scanner;

public class hakarakTox {
    public static void main(String[] args) {
 /* int[] tox ={1,2,3};
      for(int j = tox.length-1; j>=0; --j){
          System.out.println(tox[j]);
      }*/
        String tox = "Ani jan";
        char[] tox1 = tox.toCharArray();
        //System.out.println(tox1);
        for (int i = tox.length()-1; i>=0; --i){
            System.out.println(tox1[i]);
        }
  }
}

