#include <iostream>
using namespace std;

int jam, menit, detik1, detik2;
int main()
{
	cout << "KONVERSI DETIK KE JAM DAN MENIT" << endl;
	cout << "--------------------------------" << endl;
	cout << "Masukan total detik : ";
	cin >> detik1;
	cout << endl;
	
	jam=detik1/3600;
	menit=(detik1%3600)/60;
	detik2=(detik1%3600)%60;
	
	cout << "KONVERSI WAKTU : " << endl << endl;
	
	cout << detik1 << " detik" << " = ";
	cout << jam << " jam, ";
	cout << menit << " menit, ";
	cout << detik2 << " detik.";
}


