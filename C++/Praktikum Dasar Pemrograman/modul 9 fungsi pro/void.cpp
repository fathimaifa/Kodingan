#include<iostream>
using namespace std;

//definisi fungsi segitiga
float segitiga(int a, int t){
	float l;
	l=0.5*a*t;
}

void main (){
	int alas, tinggi;
	float luas;
	
	cout << "masukan alas segitiga : ";
	cin >> alas;
	cout << "masukan tinggi segitiga : ";
	cin >> tinggi;
	
	//pemanggilan fungsi segitiga
	luas=segitiga(alas, tinggi);
	cout << "Luas Segitiga : " << segitiga(alas, tinggi);
	
	cout << endl;
	
	cout << "masukan alas segitiga 2 : ";
	cin >> alas;
	cout << "masukan tinggi segitiga 2 : ";
	cin >> tinggi;
	cout << "luas segitiga : " << segitiga(alas, tinggi);
}
