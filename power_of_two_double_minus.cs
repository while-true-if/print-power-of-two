using System;
namespace power_of_two_double_minus
{
    class Program
    {
        static void Main(string[] args)
        {
            double n = 1;
            for (int i = 1; i >= -1072; i--)
            {
                n *= 0.5;
                Console.WriteLine(n);
            }
        }
    }
}