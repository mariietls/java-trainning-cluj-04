public class FizzBuzzRizzJazz {
    public static void main(String[] args)
    {
    for(int i=1;i<=100;i++)
    {
        if(i%3==0)
        {
            System.out.println("Fizz");
            i++;
        }
        if(i%5==0)
        {
            System.out.println("Buzz");
            i++;
        }
        if(i%7==0)
        {
            System.out.println("Rizz");
            i++;
        }
        if(i%11==0)
        {
            System.out.println("Jazz");
            i++;
        }
        else
            System.out.println(i);

    }
    }
}
