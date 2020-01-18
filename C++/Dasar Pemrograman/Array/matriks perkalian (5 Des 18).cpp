#include<iostream>
using namespace std;

int main(){
	int a[2][2], b[2][2], c[2][2], x;
	cout << "xxxxxxxxxxxxxxxxxxxxxxxxxxxx" << endl;
	cout << "xxxxx MATRIX PERKALIAN xxxxx" << endl;
	cout << "xxxxxxxxxxxxxxxxxxxxxxxxxxxx" << endl << endl;
	
	//matriks A
	cout << "============================" << endl;
	cout << "    masukan variabel A : " << endl;
	cout << "============================" << endl;
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
	cout << "============================" << endl;
	cout << "    masukan variabel B : " << endl;
	cout << "============================" << endl;
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << "B("<<i<<","<<j<<") = ";
			cin >> b[i][j];
		}
	} cout << endl;
	cout << "matriks B : " << endl;
	for(int i=0; i<2; i++){
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
	cout << "============================" << endl;
	cout << "  hasil perkalian matriks : \n";
	cout << "============================" << endl;
	cout << "matriks C : " << endl;
	for(int i=0; i<2; i++){
		for(int j=0; j<2; j++){
			cout << c[i][j] << " ";
		}cout << endl;
	}
		
}
