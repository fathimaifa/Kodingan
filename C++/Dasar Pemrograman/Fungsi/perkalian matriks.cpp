#include<iostream>
using namespace std;

/*di kodingan kali ini kita membahas mengenai fungsi, nah aku pake kodingan yang matriks perkalian, soalnya dimatriks
perkalian ini aku sadar banyak yang harus di cout tapi sama2 aja kodingannya, jadi mending biar ga cape cape nulis kodingan,
pake fungsi aja, biar tinggal manggil, dan kalau pun mau ngedit, gausah satu-satu diedit, tapi fungsinya aja yang di edit.*/

int simboltambah();
int garis();
int main(){
	int a[2][2], b[2][2], c[2][2], x;
	cout << "xxxxxxxxxxxxxxxxxxxxxxxxxxxx" << endl;
	cout << "xxxxx MATRIX PERKALIAN xxxxx" << endl;
	cout << "xxxxxxxxxxxxxxxxxxxxxxxxxxxx" << endl << endl;
	
	//matriks A
	garis();
	cout << "    masukan variabel A : " << endl;
	garis();
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << "A("<<i<<","<<j<<") = ";
			cin >> a[i][j];
		}
	} cout << endl;
	cout << "matriks A : " << endl;
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << a[i][j] << " ";	
		}cout << endl;
	} cout << endl;
	
	//matriks B
	garis();
	cout << "    masukan variabel B : " << endl;
	garis();
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << "B("<<i<<","<<j<<") = ";
			cin >> b[i][j];
		}
	} cout << endl;
	cout << "matriks B : " << endl;
	for(int i =0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << b[i][j] << " ";
		}cout << endl;
	} cout << endl;
	
	//rumus pengulangan for untuk perkalian matriks
	for (int i=0; i<2; i++){
		for (int j=0; j<2; j++){
			c[i][j]=0;
			for(int k=0; k<2; k++){
				x=a[i][k]*b[k][j];
				c[i][j]=c[i][j]+x;
			}
		}
	}	
	
	//hasil perkalian matriks
	garis();
	cout << "  hasil perkalian matriks : \n";
	garis();
	cout << "matriks C : " << endl;
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << c[i][j] << " ";
		}cout << endl;
	}
}

garis(){
	for (int i=1; i<15; i++){
		cout << "=";
		simboltambah();
	}
	cout << endl;
}


simboltambah(){
	cout << "$";
}
