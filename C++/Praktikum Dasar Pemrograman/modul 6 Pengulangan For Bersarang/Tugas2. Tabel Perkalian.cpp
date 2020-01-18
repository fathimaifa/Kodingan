#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int a, b, c, i, j, k, l;
	cout << "Tabel Perkalian" << endl;
	cout << "---------------------------------------------" << endl;
	
	cout << "masukan batas nilai angka pada baris tabel perkalian : ";
	cin >> a;
	cout << "Masukan batas nilai angka pada kolom tabel perkalian : ";
	cin >> b;
	
	c=a*9;
	
	// kepala tabel
	for (k=1; k<=c; k++)
	{
		cout << "-";
	}
	cout << endl;
	
	cout << "x |";
	for(l=1; l<=a; l++)
	{
		cout << "\t" << l;
	}
	cout << endl;
	
	for (k=1; k<=c; k++)
	{
		cout << "-";
	}
	cout << endl;
	// tutup kepala tabel
	
	for (i=1; i<=b; i++)
	{
		cout << i << "|\t";
		for(j=1; j<=a; j++)
		{
			cout << (i*j) << "\t";
		}
		cout << endl;
	}
}
