#include<iostream>
using namespace std;

int main(){
	struct waktu{
		int jam;
		int menit;
	};
	
	waktu selisih, masuk, keluar;
	cout << "jam masuk    : "; cin >> masuk.jam;
	cout << "menit masuk  : "; cin >> masuk.menit;
	cout << "jam keluar   : "; cin >> keluar.jam;
	cout << "menit keluar : "; cin >> keluar.menit;
	cout << "--------------------\n";
	
	cout << "waktu masuk  : " << masuk.jam << ":" << masuk.menit << endl;
	cout << "waktu keluar : " << keluar.jam << ":" << keluar.menit << endl;
	
	//menghitung selisih
	selisih.jam=keluar.jam-masuk.jam;
	if(masuk.menit>keluar.menit){
		selisih.jam=selisih.jam+1;
		selisih.menit=(menit-masuk);
	}else{
		
	}
	cout << "selisih waktu : " <<
}
