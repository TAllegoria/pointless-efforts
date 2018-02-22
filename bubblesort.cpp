#include <iostream>

using namespace std;

int main()
{
	int quantity,
		swap,
		count = 0; //counter for swap operations
	bool unsorted = true; //false if at least two elementas was swapped in iteration
	cout << "Quantity: ";
	cin >> quantity;
	int array[quantity];
	for (int i = 0; i < quantity; i++)
	{
		cin >> array[i];
	}
	while (unsorted)
	{
		unsorted = false;
		for (int i = 0; i < quantity - 1; i++)
		{
			if(array[i] > array[i + 1])
			{
				unsorted = true;
				count++;
				swap = array[i];
				array[i] = array[i + 1];
				array[i + 1] = swap;
			}
		}
	}
	for (int i = 0; i < quantity; i++)
	{
		cout << array[i] << " ";
	}
	cout << endl << "Swap operations: " << count;
	return 0;
}
