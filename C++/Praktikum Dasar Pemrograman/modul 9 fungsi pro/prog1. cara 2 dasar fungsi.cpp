#include<iostream>
using namespace std;

//deklarasi fungsi segitiga
float segitiga(int a, int t);

int main(){
	int alas, tinggi;
	float luas;
	
	cout << "masukan alas : ";
	cin >> alas;
	cout << "masukan tinggi : ";
	cin >> tinggi;
	
	//pemanggilan fungsi segitiga
	luas=segitiga(alas, tinggi);
	cout << "Luas Segitiga : " << luas;
}

//definisi fungsi segitiga
float segitiga(int a, int t){
	float l;
	l=0.5*a*t;
	return l;
}
