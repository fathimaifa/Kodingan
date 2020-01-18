#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int x, km, m, cm;
	cout << "PERJALANAN SEEKOR SEMUT" << endl;
	cout << "--------------------" << endl;
	
	cout << "semut berjalan sejauh (cm): ";
	cin >> x;
	
	km = x/100000;
	m = (x%100000)/1000;
	cm = ((x%100000)%1000);
	
	cout << "perjalanan semut = " << km << " km + " << m << " m + " << cm << " cm.";
	
	getch();
	return 0;	
}
