using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cycle_vs_recurse
{
    class Program
    {
        static float fact_cycle(int n) {
            //var p:real;

            float Result= 1;
            while (n > 1) {
                
                Result= Result * n;
                n--;
            }

            return Result;
        }

        static float fact_for(int n)
        {
            
            //  i: Integer;
            
            float  Result= 1;
            for(int i=2;i<=n;i++)
                    Result= Result * i;
            return Result;
        }
        static float fact_reclambda(int n)
        {
            Func<int, float> ff = null;
            ff = (n1) =>
              {
                  if (n1 == 1)
                      return 1;
                  else
                      return n1 * ff(n1 - 1);
              };
            return ff(n);
        }
        static float fact_rec(int n)
        //var p:real;
        {

            if (n == 1)
                return 1; else
                return n * fact_rec(n - 1);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("test!");
            Console.WriteLine("factorial cycle     20=" + fact_cycle(20).ToString("F0"));
            Console.WriteLine("factorial for cycle 20=" + fact_for(20).ToString("F0"));
            Console.WriteLine("factorial recurse   20=" + fact_rec(20).ToString("F0"));
//            Console.ReadLine();

            int n= 20;
            DateTime timeStart= DateTime.Now;
            for (int k = 1; k < 1000000; k++) {
                
                  float factorial_c = fact_cycle(n);
            }
            DateTime timeEnd= DateTime.Now;
            Console.WriteLine("Cycle     " + (timeEnd - timeStart).Ticks);

            timeStart = DateTime.Now;
            for (int k = 1; k < 1000000; k++)
            {

                float factorial_c = fact_for(n);
            }
            timeEnd = DateTime.Now;
            Console.WriteLine("Cycle for " + (timeEnd - timeStart).Ticks);

            timeStart = DateTime.Now;
            for (int k = 1; k < 1000000; k++)
            {

                float factorial_c = fact_rec(n);
            }
            timeEnd = DateTime.Now;
            Console.WriteLine("Recurse   " + (timeEnd - timeStart).Ticks);

            timeStart = DateTime.Now;
            Func<int, float> ff = null;
            ff = (n1) =>
            {
                if (n1 == 1)
                    return 1;
                else
                    return n1 * ff(n1 - 1);
            };
            
            for (int k = 1; k < 1000000; k++)
            {

                float factorial_c = ff(n);
            }
            timeEnd = DateTime.Now;
            Console.WriteLine("Recurse lmd" + (timeEnd - timeStart).Ticks);
            Console.ReadLine();


        }
    }
}
