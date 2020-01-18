#include <iostream>
#include <conio.h>

using namespace std;

void garis(){
	cout << endl << "-----------------------" << endl;
}

float i_segitiga(float a, float b){//<-parameter formal: adalah parameter yang diberi nilai
	float luas;
	luas=a*b/2;
	cout << "luas = " << luas << endl;
	return(luas);
}

float i_lingkaran(float r){
	float luas;
	luas=3.14*r*r;
	cout << "luas lingkaran = " << luas << endl;
	return(luas);
}

float i_persegi(float s){
	float luas;
	luas = s*s;
	cout << "luas persegi = " << luas << endl;
}

int main(){
	int a, n, t, s, r;
	garis();
	cout << "Pilih Menghitung";
	garis();
	cout << "1. Luas Segitiga" << endl;
	cout << "2. Luas Pesegi" << endl;
	cout << "3. Luas Lingkaran" << endl;
	garis();
	cout << "Masukan Pilihan : ";
	cin >> n;
	switch(n){
		case 1 : 
			cout << endl << "LUAS SEGITIGA" <<endl;
			cout << "Masukan alas : ";
			cin >> a;
			cout << "Masukan tinggi : ";
			cin >> t;
			i_segitiga(a,t); //<-parameter aktual : parameter yang memberi nilai
			break;
		case 2:
			cout << endl << "LUAS PERSEGI" << endl;
			cout << "Masukan sisi : ";
			cin >> s;
			i_persegi(s);
			break;
		case 3:
			cout << endl << "LUAS LINGKARAN" << endl;
			cout << "Masukan jari-jari : ";
			cin >> r;
			i_lingkaran(r);
			break;
		default :
			cout << "Pilihan tidak ada" << endl;
			break;
	}
	getch();
}
