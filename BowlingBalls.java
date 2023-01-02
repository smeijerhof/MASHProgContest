package MASHProgContest;
import java.util.Scanner;
import static java.lang.Math.*;


class BowlingBalls {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double radius = s.nextDouble();
        int count = s.nextInt();

        double collThreshold = (2*radius) + (radius/100);
        // System.out.println(collThreshold);

        // get ball co-ordinates
        double[][] balls = new double[count][2];
        for(int i = 0; i < count; i++) {
            balls[i][0] = s.nextDouble();
            balls[i][1] = s.nextDouble();
        }

        // search for collision
        for(int i = 1; i <= count; i++) {
            for(int j = i+1; j <= count; j++) {
                double x1 = abs(balls[i-1][0]);
                double y1 = abs(balls[i-1][1]);

                double x2 = abs(balls[j-1][0]);
                double y2 = abs(balls[j-1][1]);

                double distance = sqrt(pow(x1 - x2,2) + pow(y1 - y2,2));

                // System.out.println(i + "," + j + ": " + distance);
                
                // System.out.println(distance);
                if(distance < collThreshold) {
                    System.out.println(i + " " + j);

                    // stop search
                    s.close();
                    return;
                }
            }
        }
        s.close();
    }
}
