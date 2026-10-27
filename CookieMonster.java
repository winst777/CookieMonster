import java.util.Random;
public class CookieMonster
{ 
    public int remaincookies;
    public CookieMonster(int Hunger)
    {Hunger=100;}
    public static void main(String[]args){
        Elmo elmo=new Elmo(100);
        int remaincookies=elmo.bakedcookies;
        eat(elmo.bakedcookies,remaincookies,100);
    }
    public static int eat(int bakedcookies, int remaincookies, int Hunger)
    {
        Random r=new Random();
        int eat=r.nextInt(Hunger)+1;
        if(bakedcookies==0)
        {System.out.println("CookieMonster shouts, 'Me want COOKIE!'");}
        else{
            if(eat==1){
                remaincookies--;
                System.out.println("CookieMonster ate 1 cookies");
            }
            else{
                System.out.println("CookieMonster ate "+eat+"cookies");
                remaincookies=bakedcookies-eat;
                if(remaincookies<=0){   
                    eat=bakedcookies;
                    remaincookies=0;
                    System.out.println("CookieMonster shouts, 'Me want MORE COOKIES!'");
                }
            }
        }
        return remaincookies;
    }
}
