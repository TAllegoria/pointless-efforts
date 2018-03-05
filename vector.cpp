#include "vector.h"

main(){
	int option = 0;
	double x, y, scalar;
	char answer = 'n';
	cout << "Simple arithmetic operations with vectors. Please choose an option:" << endl;
	do
	{
		cout << "1. Scalar multiplication" << endl;
		cout << "2. Addition" << endl;
		cout << "3. Subtraction" << endl;
		cout << "4. Scalar product" << endl << endl;
		while (1)
		{
			cin >> option;
			if (option == 1 || option == 2 || option == 3 || option == 4)
				break;
			else
				cout << "Invalid input. Please try again" << endl;
		}
		cout << "Enter x coordinate of the vector: ";
		cin >> x;
		cout << "Enter y coordinate of the vector: ";
		cin >> y;
		Vector a(x, y);
		cout << "Your vector is ";
		a.print(); cout << endl;
		if (option == 1)
		{
			cout << "Enter scalar: ";
			cin >> scalar;
			a.scalarMultiplication(scalar);
			cout << "The result is ";
			a.print(); cout << endl;
		}
		else
		{
			cout << "Enter the second vector's x coordinate: ";
			cin >> x;
			cout << "Enter the second vector's y coordinate: ";
			cin >> y;
			Vector b(x, y);
			switch(option)
			{
			case 2:
				{
					a.addition(b);
					cout << "The result is ";
					a.print(); cout << endl;
					break;
				}
			case 3:
				{
					a.subtraction(b);
					cout << "The result is ";
					a.print(); cout << endl;
					break;
				}
			case 4:
				{
					x = a.dotProduct(b);
					cout << "The result is " << x << endl;
					break;
				}
			}
		}
		cout << "Do you need to make another calculation? (Y/N): ";
		while (1)
		{
			cin >> answer;
			if (answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n')
				break;
			else
				cout << "Invalid input. Please try again" << endl;
		}
	} while (answer == 'Y' || answer == 'y');
	return 0;
}
