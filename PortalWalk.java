package MASHProgContest;
import java.util.Arrays;
import java.util.Scanner;

class PortalWalk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        int exit = s.nextInt();

        int steps = 0;
        int pos = 0;
        
        int[] hash1 = new int[exit+1];
        int[] hash2 = new int[exit+1];

        Arrays.fill(hash1, -1);
        Arrays.fill(hash2, -1);

        for(int i = 0; i < count; i++) {
            int p1 = s.nextInt();
            int p2 = s.nextInt();

            hash1[p1] = p2;
            hash2[p2] = p1;
        }

        // print hash maps
        System.out.print("[ ");
        for(int i = 0; i < exit; i++) {
            System.out.print(hash1[i] + ", ");
        }
        System.out.println("]");

        System.out.print("[ ");
        for(int i = 0; i < exit; i++) {
            System.out.print(hash2[i] + ", ");
        }
        System.out.println("]");

        while(pos < exit) {
            steps++;
            pos++;
            if(hash1[pos] != -1)
                pos = hash1[pos];
            else if(hash2[pos] != -1)
                pos = hash2[pos];
        }

        System.out.println(steps);

        s.close();
    }
}
