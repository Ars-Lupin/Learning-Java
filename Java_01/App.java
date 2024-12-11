public class App
{
public static void main(String[] args)
    {
        double s1 = 0, s2 = 0, s3 = 0;
        double j = 50;
        for (int i = 1; i <= 50; i++)
        {
            s1 += ((i * 2) - 1) / (double)i;
            s2 += (Math.pow(2, i) / j);
            if (i <= 10)
            {
                if (i % 2 == 0)
                    s3 -= (double)i / Math.pow(i, 2);
                else
                    s3 += (double)i / Math.pow(i, 2);
            }
            j--;
        }
        System.out.printf("S1 = ");
        System.out.println(s1);
        System.out.printf("S2 = ");
        System.out.println(s2);
        System.out.printf("S3 = ");
        System.out.println(s3);
    }
}
