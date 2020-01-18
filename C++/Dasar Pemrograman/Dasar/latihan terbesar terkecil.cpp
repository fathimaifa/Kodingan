#include<iostream>
using namespace std;

int main(){
	int i, k=0, max=0, min=999999999;
	float  banyak, bil, rata;
	
	cout << "masukan banyaknya bilangan yang anda ingin inputkan : ";
	cin >> banyak;
	
	for(int i=0; i<banyak; i++){
		cout << "masukan sembarang bilangan : ";
		cin >> bil;
		if(i==0){
			max=bil;
			min=bil;
		}else if(bil<min){
			bil=min;
		}
		else if(bil>max){
			bil=max;
		}
	}
	cout << "\nbilangan terbesar : " << max;
	cout << "\nbilangan terkecil : " << min;
}
