#ifndef STACK
#include <stdio.h>
#include <time.h>

int *stack[1000];
int stackCounter = 0;

int isFull() {
  if (stackCounter < 1000) {
    return 0;
  } else {
    return 1;
  }
}

int push(int input) {
  int i;
  if (!isFull()) {
    for (i = 999; i > 0; i--) {
      stack[i] = stack[i - 1];
    }
    stack[0] = (int*)input;
    stackCounter++;
  } else {
    printf("SiF (%d)\n\n", input);
  }
}

int pull() {
  int i;
  for (i = 0; i < 999; i++) {
    stack[i] = stack[i + 1];
  }
  stack[999] = 0;
  stackCounter--;
}

int peek() {
  return (int)stack[0];
}

/*
int stackOut() {
int i;
  for (i = 0; i < 1000; i++) {
    printf("%d ", stack[i]);
  }
  printf("\n\n");
}
*/
#endif
