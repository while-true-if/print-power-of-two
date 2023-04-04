using System;
namespace power_of_two_double_plus
{
    class Program
    {
        static void Main(string[] args)
        {
            double n = 1;
            for (int i = 1; i <= 1023; i++)
            {
                n *= 2;
                Console.WriteLine(n);
            }
        }
    }
}