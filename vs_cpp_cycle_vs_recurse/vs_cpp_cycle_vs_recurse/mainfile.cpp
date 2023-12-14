#include <iostream>
#include <ctime>


        float fact_cycle(int n) {
            float Result= 1;
            while (n > 1) {
                
                Result= Result * n;
                n--;
            }

            return Result;
        }

        float fact_for(int n)
        {
            
            
            float  Result= 1;
            for(int i=2;i<=n;i++)
                    Result= Result * i;
            return Result;
        }

        float fact_rec(int n)
        {

            if (n == 1)
                return 1; else
                return n * fact_rec(n - 1);
        }

int main()
{

        	std::cout<<"test!"<<std::endl;
			std::cout<<"factorial cycle     20="<<fact_cycle(20)<<std::endl;
			std::cout<<"factorial for cycle 20="<<fact_for(20)<<std::endl;
			std::cout<<"factorial recurse   20="<< fact_rec(20)<<std::endl;

            int n= 20;
			long long ccnt=400000000;
            for (long long k = 1; k < ccnt; k++) {
                
                  float factorial_c = fact_cycle(n);
            }

			long timeStart= clock();
            for (long long k = 1; k < ccnt; k++) {
                
                  float factorial_c = fact_cycle(n);
            }
            long timeEnd= clock();
			std::cout<<"Cycle     "<<(timeEnd - timeStart)<<std::endl;

            timeStart = clock();
            for (long long k = 1; k < ccnt; k++)
            {

                float factorial_c = fact_for(n);
            }
            timeEnd = clock();
			std::cout<<"Cycle for "<<(timeEnd - timeStart)<<std::endl;

            timeStart = clock();
            for (long long k = 1; k < ccnt; k++)
            {

                float factorial_c = fact_rec(n);
            }
            timeEnd = clock();
			std::cout<<"Recurse   "<<(timeEnd - timeStart)<<std::endl;

	char ff;
	std::cin>>ff;
	return 0;
}