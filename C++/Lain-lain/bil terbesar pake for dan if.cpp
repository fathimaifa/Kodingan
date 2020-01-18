#include<iostream>
#include<windows.h>
using namespace std;

int main(){
	system("COLOR 3");
	int a, n, bil, max, min;
	
	cout << "nilai n : ";
	cin >> n;
	
	for(a=1; a<=n; a++){
		cout << "bilangan : ";
		cin >> bil;
		if(a==1){
			min=bil;
			max=bil;
		}
		else if(bil<min){
			min=bil;
		}
		else if(bil>max){
			max=bil;
		}
	}
	cout << endl;
	cout << "bilangan terbesar : " << max << endl;
	cout << "bilangan terkecil : " << min;
}
