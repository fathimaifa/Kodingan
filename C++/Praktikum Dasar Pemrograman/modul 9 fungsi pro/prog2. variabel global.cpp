#include<iostream>
using namespace std; 
//variabel g_obal

int x, y;

void tukar()
{
	int temp;
	temp=x;
	x=y;
	y=temp;
}

void main()
{
	x=5; y=7;
	cout << "awalnya: " << endl;
	cout << "X = " << x << endl;
	cout << "Y = " << y << endl;
	
	cout << "tukarkan: " << endl;
	tukar();
	cout << "X = " << x << endl;
	cout << "Y = " << y << endl;
}
