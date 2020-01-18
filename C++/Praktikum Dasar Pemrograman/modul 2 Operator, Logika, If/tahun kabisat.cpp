#include<iostream>
using namespace std;

int a;
// a = tahun
int main()
{
	cout << "PROGRAM PENDETEKSI TAHUN KABISAT" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "Masukan tahun : ";
	cin >> a;
	if(a%4==0){
		cout << "tahun tersebut merupakan tahun KABISAT";
	}
	else {
		cout << "bukan tahun KABISAT";
	}

}
