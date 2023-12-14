class FactorialTest {
        static float fact_cycle(int n) {
            float Result= 1;
            while (n > 1) {
                
                Result= Result * n;
                n--;
            }

            return Result;
        }

        static float fact_for(int n)
        {
            
            
            float  Result= 1;
            for(int i=2;i<=n;i++)
                    Result= Result * i;
            return Result;
        }

        static float fact_rec(int n)
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

            int n= 20;
            long timeStart= System.nanoTime();
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

    }
}
