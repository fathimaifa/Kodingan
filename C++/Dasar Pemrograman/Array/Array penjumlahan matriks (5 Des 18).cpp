#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int k, a[2][2], b[2][2], c[2][2];
	//matriks a
	cout << "=== Matriks Pertama ===" << endl;
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++){
			cout << "masukan angka di ("<<i<<","<<j<<") = ";
			cin >> a[i][j];
		}
	}
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
			cout << a[i][j];
		cout << endl;
	}
	
	//matriks b
	cout << "=== Matriks Kedua ===" << endl;
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
			cin >> a[i][j];
	}
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
			cout << a[i][j];
		cout << endl;
	}
	
	//matriks c	
	cout << "=== Penjumlahan Matriks Pertama dan Kedua ===" << endl;
	for(int k=0; k<2; k++)
	{
		for(int j=0; j<2; j++)
		{
			c[i][j] = a[i][j]+b[i][j];
			cout << c[i][j];
		}
		cout << endl;
	}
}

