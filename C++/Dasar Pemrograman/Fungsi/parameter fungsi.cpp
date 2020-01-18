#include <iostream>
#include <conio.h>
using namespace std;
void garis(){
	cout << endl << "--------------------" << endl;
}
float i_segitiga(float a,float b){
	float luas;
	luas = a * b /2;
	cout << "Luas = " << luas << endl;
	return (luas);
}
float i_lingkaran(float r){
	float luas;
	luas = 3.14 * r * r;
	cout << "Luas Lingkaran = " << luas << endl;
	return (luas);
}
float i_persegi(float s){
	float luas;
	luas = s * s;
	cout << "Luas Persegi = " << luas << endl;
}
int main(){
	int a,n,t,s,r;
	garis();
	cout << "Pilih Menghitung ";
	garis();
	cout << "1. Luas Segitiga " << endl;
	cout << "2. Luas Persegi " << endl;
	cout << "3. Luas Lingkaran " << endl;
	garis();
	cout << "Masukan Pilihan : " ;
	cin >> n;
	switch(n){
		case 1 :
			cout << endl << "Luas Segitiga" << endl;
			cout << "Masukan Alas : ";
			cin >> a;
			cout << "Masukan Tinggi : "; cin>>t;
			i_segitiga(a,t);
			break;
		case 2 :
			cout << endl << "Luas Persegi" << endl;
			cout << "Masukan Sisi : ";
			cin >> s;
			i_persegi(s);
			break;
		case 3 :
			cout << endl << "Luas Lingkaran" << endl;
			cout << "Masukan Jari - Jari : ";
			cin >> r;
			i_lingkaran(r);
			break;
		default :
			cout << "Pilihan Tidak Ada" << endl;
			break;
	}
	getch();
}
//Kholisah Lustinasari 

