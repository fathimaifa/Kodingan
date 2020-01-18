#include<iostream>
using namespace std;

int celcius_ke_fahrenheit (int c, int f){
	f=1.8*c+32;
	cout << "suhu dalam fahrenheit      : " << f << endl;
	return f;
}

int celcius_ke_reamur (int c, int r){
	r=0.8*c;
	cout << "suhu dalam reamur          : " << r << endl;
	return r;
}

int main(){
	int celcius, fahrenheit, reamur;
	cout << "masukan suhu dalam celcius : ";
	cin >> celcius;
	
	//hasil konversi
	celcius_ke_fahrenheit(celcius, fahrenheit);
	celcius_ke_reamur(celcius, reamur);
}
