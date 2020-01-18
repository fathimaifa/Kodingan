#include<iostream>
using namespace std;

float a;
int main()
{
	cout << "PROGRAM PENGECEKAN BILANGAN BULAT" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "Masukan sebuah angka : ";
	cin >> a;
	
	if(a>0)
		cout << "Angka tersebut merupakan bilangan positif.";
	else if(a<0)
		cout << "Angka merupakan bilangan negatif.";
	else
		cout << "Angka tersebut bukan merupakan bilangan positif maupun negatif.";	
}
