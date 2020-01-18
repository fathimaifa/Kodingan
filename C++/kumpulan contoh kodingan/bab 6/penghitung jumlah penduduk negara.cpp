#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int jumpen, kelahiran, migrasi, kematian, emigrasi;
	
	cout << "PROGRAM PENGHITUNG JUMLAH PENDUDUK SUATU NEGARA" << endl;
	cout << "---------------------------------" << endl;
	
	cout << "jumlah kelahiran : ";
	cin >> kelahiran;
	
	cout << "jumlah migrasi : ";
	cin >> migrasi;
	
	cout << "jumlah kematian : ";
	cin >> kematian;
	
	cout << "jumlah emigrasi : ";
	cin >> emigrasi;
	
	jumpen = (kelahiran+migrasi)-(kematian+emigrasi);
	
	cout << "jumlah penduduk adalah : " << jumpen;
	
	getch();
	return 0;
}
