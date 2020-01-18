#include<iostream>
using namespace std;

int main(){
	int x, a[x];
	float k, rata;
	
	cout << "banyaknya bilangan yang akan anda hitung rata-ratanya : ";
	cin >> x;
	
	cout << "input bilangan : \n";
	for(int i=0; i<x; i++){
		cout << "bilangan ke-" << (i+1) << " : ";
		cin >> a[i];
	}
	
	cout << "bilangan-bilangan yang anda masukan : ";
	for(int i=0; i<x; i++){
		cout << a[i] << " ";
		k=k+a[i];
	}

	rata=k/x;
	cout << "\nrata-rata dari bilangan tersebut adalah : " << rata;
}
