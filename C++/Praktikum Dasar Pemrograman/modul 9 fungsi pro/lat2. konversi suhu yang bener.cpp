#include<iostream>
using namespace std;

int celcius_ke_fahrenheit (int c){
	c=1.8*c+32;
	cout << "suhu dalam fahrenheit      : " << c << endl;
	return c;
}

int celcius_ke_reamur (int c){
	c=0.8*c;
	cout << "suhu dalam reamur          : " << c << endl;
	return c;
}

int main(){
	int celcius;
	cout << "masukan suhu dalam celcius : ";
	cin >> celcius;
	
	//hasil konversi
	celcius_ke_fahrenheit(celcius);
	celcius_ke_reamur(celcius);
}
