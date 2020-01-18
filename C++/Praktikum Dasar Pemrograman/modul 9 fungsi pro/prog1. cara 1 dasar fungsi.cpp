#include<iostream>
using namespace std;

//definisi fungsi segitiga
float segitiga(int a, int t){
	float l;
	l=0.5*a*t;
	return l;
}

int main (){
	int alas, tinggi;
	float luas;
	
	cout << "masukan alas segitiga : ";
	cin >> alas;
	cout << "masukan tinggi segitiga : ";
	cin >> tinggi;
	
	//pemanggilan fungsi segitiga
	luas=segitiga(alas, tinggi);
	cout << "Luas Segitiga : " << segitiga(alas, tinggi);
	
	
	
	
	
	
	
	
	
	/*tambahan dari aku cuman buat ngecek nilainya bakal berfungsi gak, kalau aku bikin segitiga 2, tapi variablenya 
	tetep pake alas sama tinggi, gapake alas2 tinggi2*/
	cout << endl;
	
	cout << "masukan alas segitiga 2 : ";
	cin >> alas;
	cout << "masukan tinggi segitiga 2 : ";
	cin >> tinggi;
	cout << "luas segitiga : " << segitiga(alas, tinggi);
}
