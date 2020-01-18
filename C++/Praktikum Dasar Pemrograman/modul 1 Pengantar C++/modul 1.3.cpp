#include <iostream>
using namespace std;

float l, r, k;
int main()
{
	cout << "Program Penghitung Luas dan Keliling Lingkaran" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "Masukan panjang jari jari lingkaran : ";
	cin >> r;
	
	l=3.14*r*r;
	cout << "\nLuas lingkaran dengan jari-jari " << r << " : " << l << endl;
	
	k=2*3.14*r;
	cout << "Keliling lingkaran dengan jari-jari " << r <<  " : " << k << endl;
	
	return 0;
}
