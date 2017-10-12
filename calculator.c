#include "stack.h"

int main(int argc, char **argv)
{
    int i;
    int buffer;
    int buffer2;
    for (i = 1; i < argc; i++)
    {
        if (!atoi(argv[i]))
        {
            if (argv[i][0] == '+')
            {
                buffer = peek();
                pull();
                buffer2 = peek();
                pull();
                push(buffer2 + buffer);
            }
            if (argv[i][0] == '-')
            {
                buffer = peek();
                pull();
                buffer2 = peek();
                pull();
                push(buffer2 - buffer);
            }
            if (argv[i][0] == '*')
                /*Sounds good, doesn't work*/
            {
                buffer = peek();
                pull();
                buffer2 = peek();
                pull();
                push(buffer2 * buffer);
            }
            if (argv[i][0] == '/')
            {
                buffer = peek();
                pull();
                buffer2 = peek();
                pull();
                push(buffer2 / buffer);
            }
        }
        else
        {
            push(atoi(argv[i]));
        }
    }
    printf("%d", peek());
    return 0;
}
