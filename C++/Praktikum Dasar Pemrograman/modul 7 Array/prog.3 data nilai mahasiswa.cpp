#include<iostream>
using namespace std;

int main(){
	int i, j, nilai[5][5];
	
	cout << "Inputkan nilai mahasiswa" << endl;
	cout << "------------------------" << endl;
	
	for (i=0; i<3; i++){
		cout << "Mahasiswa ke-"<<(i+1)<<"" << endl;
		for(j=0; j<3; j++){
			cout << "Nilai ke-"<<(i+1)<<" : ";
			cin >> nilai[i][j];
		}
		cout << endl;
	}
	
	cout << "====================" << endl;
	cout << "DATA NILAI MAHASISWA" << endl;
	cout << "====================" << endl;
	
	cout << "Nilai ke | 1  2  3  \n";
	cout << "------------------- \n";
	
	for(i=0; i<3; i++){ 
		cout << "Mhs ke-" << (i+1) << " : "; 
		for(j=0; j<3; j++) cout << nilai[i][j] << " "; 
			cout << endl; 
	} 
}
