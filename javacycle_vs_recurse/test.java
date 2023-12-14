class FactorialTest {
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
        static float fact_rec(int n)
        //var p:real;
        {

            if (n == 1)
                return 1; else
                return n * fact_rec(n - 1);
        }

    public static void main(String[] args) {

            System.out.println("test!");
            System.out.println("factorial cycle     20=" + fact_cycle(20));
            System.out.println("factorial for cycle 20=" + fact_for(20));
            System.out.println("factorial recurse   20=" + fact_rec(20));
//            Console.ReadLine();

            int n= 20;
            long timeStart= DateTime.Now;
            for (int k = 1; k < 1000000; k++) {
                
                  float factorial_c = fact_cycle(n);
            }
            long timeEnd= System.nanoTime();
            System.out.println("Cycle     " + (timeEnd - timeStart));

            timeStart = System.nanoTime();
            for (int k = 1; k < 1000000; k++)
            {

                float factorial_c = fact_for(n);
            }
            timeEnd = System.nanoTime();
            System.out.println("Cycle for " + (timeEnd - timeStart));

            timeStart = System.nanoTime();
            for (int k = 1; k < 1000000; k++)
            {

                float factorial_c = fact_rec(n);
            }
            timeEnd = System.nanoTime();
            System.out.println("Recurse   " + (timeEnd - timeStart));

            timeStart = System.nanoTime();
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
            timeEnd = System.nanoTime();
            System.out.println("Recurse lmd" + (timeEnd - timeStart));
            //Console.ReadLine();
    }
}
