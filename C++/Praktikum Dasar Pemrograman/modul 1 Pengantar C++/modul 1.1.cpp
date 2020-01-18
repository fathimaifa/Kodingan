#include<iostream>
#include <math.h>

using namespace std;

float a, t, c;

int main()
{
	cout << "PROGRAM PENGHITUNG SISI MIRING SEGITIGA SIKU-SIKU" << endl;
	cout << "-------------------------------------------------" << endl;
	
	cout << "Masukan alas segitiga : ";
	cin >> a;
	cout << "Masukan tinggi segitiga : ";
	cin >> t;
	
	cout << "...\n" << endl;
	c=sqrt((a*a)+(t*t));
	cout << "Sisi miring segitiga dengan alas " << a << " dan tinggi " << t << " adalah : " << c;
	
	return 0;
}
