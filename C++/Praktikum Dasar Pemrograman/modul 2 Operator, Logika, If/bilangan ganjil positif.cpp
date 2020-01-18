#include<iostream>
using namespace std;

int a;
int main()
{
	cout << "PROGRAM PENDETEKSI BILANGAN GANJIL POSITIF" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "Masukan angka : ";
	cin >> a;
	
	if((a>0)&&(a%2!=0))
		cout << "Ya, ini bilangan ganjil positif.";
	else
		cout << "Maaf, bilangan ini bukan ganjil positif.";
}
