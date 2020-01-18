#include<iostream>
using namespace std;

int a;
// a = tahun
int main()
{
	cout << "PROGRAM PENDETEKSI TAHUN KABISAT" << endl;
	cout << "--------------------------" << endl;
	
	cout << "Masukan tahun : ";
	cin >> a;
	
	if (a%400==0) 
		cout << "KABISAT";
	else if ((a%400!=0)&&(a%100==0))
		cout << "bukan KABISAT";
	else if ((a%400!=0)&&(a%100!=0))
	{
		if (a%4!=0)
			cout << "bukan KABISAT";
	}
	
}