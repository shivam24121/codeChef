import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t--> 0) {
            int n = obj.nextInt();
            String srt = IntStream.rangeClosed(1, n)
                .boxed()
                .sorted((a, b) -> {
                    int aa = gcd(a, n);
                    int bb = gcd(b, n);

                    if (aa != bb) {
                        return Integer.compare(bb,aa);
                    }
                    return Integer.compare(a, b);
                })
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

            System.out.println(srt);
        }

    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);

    }
}
