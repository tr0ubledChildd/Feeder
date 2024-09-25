public class Main 
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
//System.out.println(f.currentFood);
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        int min = 10;
        int max = 50;
        double random = (int)(Math.random()*(max-min))+min;
        System.out.println(random); 
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());   
        }
           }
    



