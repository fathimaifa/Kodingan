#include<iostream>
using namespace std;

int ganjilgenap (int n){
	if (n%2==0){
		cout << "genap" << endl;
	}
	else{
		cout << "ganjil" << endl;
	}
}

main(){
	int n, angka;
	cout << "masukan berapa angka yang akan anda input : ";
	cin >> n;
	
	for (int i=1; i<=n; i++){
		cout << "masukan sebuah angka : ";
		cin >> angka;
		ganjilgenap(angka);
	}
}
