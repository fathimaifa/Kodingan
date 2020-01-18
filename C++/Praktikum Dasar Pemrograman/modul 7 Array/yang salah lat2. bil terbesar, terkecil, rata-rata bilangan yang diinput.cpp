#include<iostream>
using namespace std;

int main(){
	int rata, k, max, min, n, bil[n];
	
	cout << "masukan banyaknya inputan : ";
	cin >> n;
	
	cout << "masukan bilangan : " << endl;
	for(int i=0; i<n; i++){
		cout << "bil " << (i+1) << " : "; 
		cin >> bil[i];
		if(i==0){
			max=bil[i];
			min=bil[i];
		}
		else if(bil[i]>max){
			max=bil[i];
		}
		else if(bil[i]<min){
			min=bil[i];
		}
	}
	cout << "bilangan terbesar : " << max << endl;
	cout << "bilangan terkecil : " << min << endl;
}
