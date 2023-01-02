package MASHProgContest;
import java.util.Scanner;


class PrimeTiling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int width = s.nextInt();
        float prime = s.nextInt();

        // System.out.println((length / prime) % 1);
        // System.out.println((width  / prime) % 1);

        if( ((length / prime) % 1 == 0) || ((width / prime) % 1 == 0) ) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
