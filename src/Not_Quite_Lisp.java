import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Not_Quite_Lisp {
    public void mainProgram() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Directions.txt"));
        Scanner scan = new Scanner(bufferedReader);
        int up = 0;
        int down = 0;

        while(scan.hasNext()){
            String line = scan.nextLine();
            char charUp = '(';
            char charDown = ')';

            for(int i =0; i<line.length(); i++){
                if(line.charAt(i) == charUp){
                    up++;
                } else if (line.charAt(i) == charDown) {
                    down++;
                }
            }
        }
        int sum = up - down;
        System.out.println(sum);
    }

    public static void main(String[] arg) throws FileNotFoundException {
        Not_Quite_Lisp n = new Not_Quite_Lisp();
        n.mainProgram();
    }
}
