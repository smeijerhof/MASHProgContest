package MASHProgContest;
import java.util.Scanner;

 class ActualAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int len = s.nextInt();
        int total = 0;

        for(int i = 0; i < len; i++) {
            total += s.nextInt();
        }

        System.out.println(total);

        s.close();
    }    
}
