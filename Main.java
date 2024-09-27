public class Main 
{
    public static void main(String[] args)
    {
        int min = 10;
        int max = 50;
        double random = (int)(Math.random()*(max-min))+min;
        Feeder k = new Feeder(0);
        System.out.println(k.simulateManyDays(5, 10));
        }
           }

           
    



