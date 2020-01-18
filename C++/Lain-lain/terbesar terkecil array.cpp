#include<iostream>
#include<windows.h>
using namespace std;

int main(){
	system("COLOR 3");

	float max, min, rata, k;
	int n, a, bil[n];
	cout << "nilai n : ";
	cin >> n;
	
	for(a=0; a<n; a++){
		cout << "bilangan : ";
		cin >> bil[n];
		if(a==0){
			min=bil[n];
			max=bil[n];
		}
		else if(bil[n]<min){
			min=bil[n];
		}
		else if(bil[n]>max){
			max=bil[n];
		}
	}
	cout << endl;
	cout << "bilangan terbesar : " << max << endl;
	cout << "bilangan terkecil : " << min;
}
