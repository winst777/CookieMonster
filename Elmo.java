import java.util.Random;
import java.util.Scanner;
public class Elmo
{
    public static int OvenSize=100;
    public static int testcookies;
    public static int bakedcookies;
    public static int batchcookies;
    public static int sum;
    public Elmo(int OvenSize)
    {OvenSize=100;}
    public static void mainElmo(String[]args)
    {
        Random r=new Random();
        oven();
        getBakedCookieNumbers();
    }
    public static int test()
    {
        //bakedcookies=0;
        testcookies=bakedcookies+1;
        System.out.println("Elmo print "+testcookies+" cookie for test");
        return testcookies;
    }
    public static void oven(){
        Random r=new Random();
        bakedcookies=r.nextInt(100)+1;
        batchcookies+=bakedcookies+testcookies;
    }
    public static int getBakedCookieNumbers()
    {
        sum=sum+batchcookies;
        System.out.println("Elmo noted "+sum+" baked cookies on record.");
        return sum;
    }
}