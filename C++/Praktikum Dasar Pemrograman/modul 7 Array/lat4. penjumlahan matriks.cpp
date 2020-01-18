#include<iostream>
using namespace std;

int main(){
	int a[2][2], b[2][2], c[2][2];
	
	//matriks a
	cout << "MATRIKS A \n";
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << "bil ke-" << (i+1) << " : ";
			cin >> a[i][j];
		}
	}
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << a[i][j] << " ";
		}
		cout << endl;
	} 
	cout << endl;
	
	//matriks b
	cout << "MATRIKS B \n";
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << "bil ke-" << (i+1) << " : ";
			cin >> b[i][j];
		}
	}
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << b[i][j] << " ";
		}
		cout << endl;
	}
	cout << endl;
	
	//matriks c (matriks a + matriks b)
	cout << "HASIL PENJUMLAHAN MATRIKS A DAN MATRIKS B" << endl;
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			c[i][j]=a[i][j]+b[i][j];
			cout << c[i][j] << " ";
		}
		cout << endl;
	}
	
}
