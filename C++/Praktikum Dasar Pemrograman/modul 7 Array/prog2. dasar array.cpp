#include<iostream>
using namespace std;

int main(){
	int i, j, bil[5];
	cout << "========================\n";
	cout << "masukan 5 buah bilangan\n";
	cout << "========================\n";
	
	//for buat pengulangan si cin array nya
	for(i=0; i<5; i++){
		cout << "bilangan ke-" << (i+1) << " = ";
		cin >> bil[i];
	}
	
	cout << "------------------------\n";
	
	//menampilkan array sesuai urutan yang tadi udah dimasukin
	cout << "bilangan yang diinputkan : \n";
	for(j=0; j<5; j++){
		cout << bil[j] << " ";
	}
}
