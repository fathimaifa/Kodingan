#include<iostream>
using namespace std; 

int main(){
	
	int i, n, bil[n], max, min;
	float k=0, rata;
	cout << "banyaknya inputan : ";
	cin >> n;
	
	for(i=0; i<n; i++){
		cout << "masukan sebuah angka : ";
		cin >> bil[i];
		if(i==0){
			max=bil[i];
			min=bil[i];
		}else if(max<bil[i]){
			max=bil[i];
		}else if(min>bil[i]){
			min=bil[i];
		}
		k=k+bil[i];
	}
	
	rata=k/n;
	cout << "rata-rata    : " << rata << endl;
	cout << "bil terbesar : " << max << endl;
	cout << "bil terkecil : " << min << endl;
}
