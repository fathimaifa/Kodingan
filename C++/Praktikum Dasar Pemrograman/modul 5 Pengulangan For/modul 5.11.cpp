#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;

//menghitung pangkat sebuah bilangan
int main()
{
	int x, y, z;
	cout << "Masukan angka yang akan dipangkatkan : ";
	cin >> x;
	
	cout << "Masukan angka yang jadi pangkatnya : ";
	cin >> y;
	
	z=pow(x,y);
	cout << endl << z;
}
