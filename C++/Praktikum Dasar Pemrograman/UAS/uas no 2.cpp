#include<iostream>
using namespace std;

//bilangan ganjil genap pake parameter
//data mahasiswa, masukin nilai, nim, nimnya pake for

int ganjilgenap (int n){
	if (n%2==0){
		cout << "genap" << endl;
	}
	else{
		cout << "ganjil" << endl;
	}
}

main(){
	int angka;
	cout << "masukan sebuah angka : ";
	cin >> angka;
	ganjilgenap(angka);
}
