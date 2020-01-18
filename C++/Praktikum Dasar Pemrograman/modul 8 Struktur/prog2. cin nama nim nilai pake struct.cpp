#include<iostream>
using namespace std;

main(){
	struct dataMhs{
		char nama[20];
		long int nim;
		float nilai;
	};
	
	dataMhs mhs[10];
	cout << "Masukan 3 data mahasiswa\n";
	cout << "========================\n";
	for(int z=0; z<3; z++){
		cout << "Mahasiswa ke-" << (z+1) << endl;
		cout << "-------------" << endl;
		cout << "Nama  : "; cin >> mhs[z].nama;
		cout << "NIM   : "; cin >> mhs[z].nim;
		cout << "Nilai : "; cin >> mhs[z].nilai;
		cout << endl;
	}
}
