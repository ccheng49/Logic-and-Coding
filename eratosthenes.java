import java.util.Arrays;
public class eratosthenes
{
    public static boolean[] sieve = new boolean [1000];
    
    public static void main(String[] args) {
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        
        /*for (int x=2; x<=999; x++)
        {
            if (x==2 || x==3 || x==5 || x==7)
            {
                sieve[x] = true;
            }
            else if (x%2==0 || x%3==0 || x%5==0 || x%7==0)
            {
                sieve [x] = false;
            }
        }
        System.out.println(java.util.Arrays.toString(sieve));*/
        
        for (int i=2; i<sieve.length; i++)
        {
            for (int j=2*i; j<sieve.length; j+=i)
            {
                sieve[j] = false;
            }
        }
        System.out.println(java.util.Arrays.toString(sieve));
        
        int[] result = collectPrimes();
        primeFactors(result);
    }
    
    public static int[] collectPrimes()
    {
        int count = 0;
        for (int x=0; x<=999; x++)
        {
            if (sieve[x] == true)
            {
                count = count+1;
            }
        }
        int[] primeNumbers = new int[count];
        int z=0;
        for (int y=0; y<=999; y++)
        {
            if (sieve[y] == true)
            {
                primeNumbers[z] = y;
                z++;
            }
        }
        System.out.println(java.util.Arrays.toString(primeNumbers));
        return primeNumbers;
    }
    
    public static void primeFactors (int[] primeNumbers)
    {
        int number=132;
        int d, n;
        for (int a=0; a<=number; a++)
        {
            if (number>a)
            {
                n = number/a;
                // not done
            }
        }
    }
}