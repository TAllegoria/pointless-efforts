#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void hoarasort(int* a, int first, int last)
{

    int i = first, j = last;
    double tmp, x = a[(first + last) / 2];

    do
    {
        while (a[i] < x)
            i++;
        while (a[j] > x)
            j--;

        if (i <= j)
        {
            if (i < j)
            {
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            i++;
            j--;
        }
    }
    while (i <= j);

    if (i < last)
        hoarasort(a, i, last);
    if (first < j)
        hoarasort(a, first, j);
}

int main()
{
    srand(time(NULL));
    char v; /*amount of elements of the array*/
    int N;
    int min, max;
    int i, j;
    int b = 0;
    char ch;


    do
    {
        printf("Please enter the amount of items in the array (1 - 100):\n");
        scanf("%s", &v);
        N = atoi(&v);

        if(N <= 0 || N > 100)
        {
            printf("\nAn error has occurred. Please repeat your enter.\n");
        }
    }
    while (N <= 0 || N > 100);


    int a[N - 1];
    int m[N - 1];
    int a1[N - 1];

    printf("\nDo you want to fill the array automatically? (Y/N) \n");

    do
    {
        fflush(stdin);
        scanf("%c", &ch);
        if (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n')
            printf("\nPlease stick with the Y/N format.\n");
    }
    while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');

    printf("\nYour choice is %c.\n", ch);
    if (ch == 'Y' || ch == 'y')
    {
        for (i = 0; i <= N - 1; i++)
        {
            a[i] = rand()%100;

        }

    }
    else if(ch == 'N' || ch == 'n')
    {
        printf("\nEnter your array:\n");
        for (i = 0; i <= N-1; i++)
        {
            scanf("%d", &a[i]);
        }
    }

    printf("\nYour array is:\n");
    for (i = 0; i <= N-1; i++)
    {
        printf("%d ", a[i]);
    }

    for (i = 0; i <= N-1; i++)
    {
        m[i] = a[i];
    }

    /*method of bubble*/
    for (i = 0; i < N; i++)
		a1[i] = a[i];
    while (b <= N)
    {
        for (i = 0; i < N; i++)
        {
            if (a1[i] > a1[i+1])
            {
                j = a1[i];
                a1[i] = a1[i+1];
                a1[i+1] = j;
            }
        }
        b++;
    }

    /*quicksort*/
    hoarasort(m, 0, N-1);

    int temp=a[0];
    for (i = 1; i <= N; i++)
    {
        if(a[i] != temp)
        {
            for (j = i + 1; j <= N; j++)
            {
                if(a[i] == a[j])
                    a[j] = temp;
            }
        }
    }


    printf("\n\nMethod of bubble. New array is:\n");
    for (i = 0; i < N; i++)
    {
        printf("%d ", a1[i]);
    }

    printf("\n\nQuicksort. New array is:\n");
    for (i = 0; i < N; i++)
    {
        printf("%d ", m[i]);
    }

    printf ("\n\nMinimum: ");
    printf("%d \n", m[0]);

    printf ("\nMaximum: ");
    printf("%d \n", m[N - 1]);

    return 0;
}
