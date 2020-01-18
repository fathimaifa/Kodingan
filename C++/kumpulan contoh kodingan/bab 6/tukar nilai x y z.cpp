#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int x, y, z, a;
	 cout << "PROGRAM PERTUKARAN NILAI BILANGAN X, Y, Z" << endl;
	 cout << "--------------------------" << endl;
	 
	 cout << "masukan nilai x : ";
	 cin >> x;
	 
	 cout << "masukan nilai y : ";
	 cin >> y;
	 
	 cout << "masukan nilai z : ";
	 cin >> z;
	 
	//tukar
	
	a=x;
	x=y;
	y=z;
	z=a;
	
	cout << x << " " << y << " " << z << endl; 
	
	getch();
	return 0;  
}
