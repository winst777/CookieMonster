import java.util.Random;
public class Driver
{
    public int remaincookies;
    public static void main(String[]args)
    {
        Elmo elmo=new Elmo(1);
        CookieMonster cookieMonster=new CookieMonster(1);
        for(int i=1;i<=30;i++){
            Random r=new Random();
            int sw=r.nextInt(4)+1;
            switch(sw){
                case 1:
                elmo.test();
                System.out.println("test invoked, "+ cookieMonster.remaincookies+" cookies remained");
                break;
                case 2:
                elmo.oven();
                System.out.println("oven invoked, "+cookieMonster.remaincookies+" cookies remained");
                break;
                case 3:
                elmo.getBakedCookieNumbers();
                System.out.println("getBakedCookieNumbers invoked, "+cookieMonster.remaincookies+" cookies remained");
                break;
                case 4:
                cookieMonster.eat(elmo.bakedcookies, cookieMonster.remaincookies,100);
                System.out.println("eat invoked, "+cookieMonster.remaincookies+" cookies remained");
                break;
            }
        }
        System.out.println("Elmo produced "+elmo.sum+" in total");
    }
}
