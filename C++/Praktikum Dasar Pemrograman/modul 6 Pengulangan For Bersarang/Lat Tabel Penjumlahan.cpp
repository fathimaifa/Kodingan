#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int i, j, k;
	cout << "Tabel Penjumlahan" << endl;
	cout << "---------------------------------------------" << endl;
	
	cout << "+ |\t1\t2\t3\t4\t5" << endl;
	
	for (k=1; k<=45; k++)
	{
		cout << "-";
	}
	cout << endl;
	for (i=1; i<=9; i++)
	{
		cout << i << "|\t";
		for(j=1; j<=5; j++)
		{
			cout << (i+j) << "\t";
		}
		cout << endl;
	}
}
