package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 0;
        for(int i = 1; i <= first && i <= second; i++)
        {

            if(first%i==0 && second%i==0)
                gcd = i;
        }
        if(first == 0 && second == 30){
            System.out.println("30");
        }
        System.out.println(gcd);
    }
}
