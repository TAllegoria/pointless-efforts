#include "stack.h"
#include <string.h>

int main(int argc, char **argv)
{
    int i;
    int buffer;
    int buffer2;
    for (i = 1; i < argc; i++)
    {
        if (!atoi(argv[i]))
        {
            if (!strcmp(argv[i], "+"))
            {
                buffer = peek();
                pull();
                buffer2 = peek();
                pull();
                push(buffer2 + buffer);
            }
            if (!strcmp(argv[i], "-"))
            {
                buffer = peek();
                pull();
                buffer2 = peek();
                pull();
                push(buffer2 - buffer);
            }
            if (!strcmp(argv[i], argv[0]))
            {
                buffer = peek();
                pull();
                buffer2 = peek();
                pull();
                push(buffer2 * buffer);
            }
            if (!strcmp(argv[i], "/"))
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
