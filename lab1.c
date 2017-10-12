#include <stdio.h>
#include <stdlib.h>

main(int argc, char **argv)
{
    double K, F, C;
    if (argc == 3)
    {
        if (argv[2][0] == 'C')
        {
            C = atof(argv[1]);
            if (C >= -273.15)
            {
                F = C / 5.0 * 9.0 + 32.0;
                K = C + 273.15;
                printf("%0.2f F\n%0.2f K\n", F, K);
            }
            else
                printf("Input is below the absolute zero\n");
        }
        if (argv[2][0] == 'F')
        {
            F = atof(argv[1]);
            if (F >= -459.67)
            {
                C = (F - 32.0) / 9.0 * 5.0;
                K = C + 273.15;
                printf("%0.2f C\n%0.2f K\n", C, K);
            }
            else
                printf("Input is below the absolute zero\n");
        }
        if (argv[2][0] == 'K')
        {
            K = atof(argv[1]);
            if (K >= 0.0)
            {
                C = K - 273.15;
                F = C / 5.0 * 9.0 + 32.0;
                printf("%0.2f C\n%0.2f F\n", C, F);
            }
            else
                printf("Input is below the absolute zero\n");
        }
    }
    else if (argc == 2)
    {
        C = atof(argv[1]);
        if (C >= -273.15)
        {
            F = C / 5.0 * 9.0 + 32.0;
            K = C + 273.15;
            printf("%0.2f C:\n%0.2f F\n%0.2f K\n\n", C, F, K);
        }
        else
            printf("%0.2f C:\nInput is below the absolute zero\n\n");

        F = atof(argv[1]);
        if (F >= -459.67)
        {
            C = (F - 32.0) / 9.0 * 5.0;
            K = C + 273.15;
            printf("%0.2f F:\n%0.2f C\n%0.2f K\n\n", F, C, K);
        }
        else
            printf("%0.2f F:\nInput is below the absolute zero\n\n");

        K = atof(argv[1]);
        if (K >= 0.0)
        {
            C = K - 273.15;
            F = C / 5.0 * 9.0 + 32.0;
            printf("%0.2f K:\n%0.2f C\n%0.2f F\n\n", K, C, F);
        }
        else
            printf("%0.2f K:\nInput is below the absolute zero\n");
    }
    return 0;
}
