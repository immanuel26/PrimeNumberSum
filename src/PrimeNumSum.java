public class PrimeNumSum
{
    public static void main(String[] args)
    {
        int i = 0;
        int num = 0;
        int sumPrimeNumbers = 0;
        String primeNumbers = "";
        for (i = 1; i <= 50; i++)
        {
            int counter = 0;
            for (num = i; num >= 1; num--)
            {
                if (i % num == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                primeNumbers = primeNumbers + i + "  ";
                sumPrimeNumbers = sumPrimeNumbers + i;
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println("Sum " +sumPrimeNumbers);
        System.out.println(primeNumbers);
    }
}
