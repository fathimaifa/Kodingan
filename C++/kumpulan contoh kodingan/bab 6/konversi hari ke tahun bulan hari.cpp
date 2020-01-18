#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int tahun, bulan, hari1, hari2;
	
	cout << "program penghitung hari pengerjaan proyek" << endl;
	cout << "----------------------------" << endl;
	
	cout << "masukan hari pengerjaan proyek : ";
	cin >> hari1;
	
	tahun = hari1/365;
	bulan = (hari1%365)/30;
	hari2 = (hari1%365)%30;
	
	cout << "konversi waktu:" << endl;
	cout << "Proyek anda dikerjakan selama: " << tahun << " tahun, " << bulan << " bulan, " << hari2 << " hari." << endl;
	
	getch ();
	return 0;
}
