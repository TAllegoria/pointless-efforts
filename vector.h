#ifndef VECTOR_H_INCLUDED
#define VECTOR_H_INCLUDED
#include <iostream>
#include <math.h>

using namespace std;

class Vector
{
private:
	double x, y;
public:
	Vector(double X, double Y)
	{
		x = X;
		y = Y;
	}

	double getX()
	{
		return x;
	}

	double getY()
	{
		return y;
	}

	void setX(double X)
	{
		x = X;
	}
	
	void setY(double Y)
	{
		y = Y;
	}
	
	void print()
	{
		cout << "(" << x << "; " << y << ")";
	}

	void scalarMultiplication(double scalar)
	{
		x *= scalar;
		y *= scalar;
	}

	void addition(Vector* secondTerm)
	{
		x += secondTerm->getX();
		y += secondTerm->getY();
	}

	void subtraction(Vector* subtrahend)
	{
		x -= subtrahend->getX();
		y -= subtrahend->getY();
	}

	double dotProduct(Vector* multiplier)
	{
		return x * multiplier->getX() + y * multiplier->getY();
	}
};

#endif // VECTOR_H_INCLUDED
