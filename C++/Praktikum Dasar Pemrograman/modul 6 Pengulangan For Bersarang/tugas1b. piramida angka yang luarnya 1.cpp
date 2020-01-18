#include<iostream>
using namespace std;

int main(){
	
	int i, j, k, m, n;
	
	for(i=1; i<=5; i++){
		//pengaturan barisan
		for(j=i; j<=5; j++)
			cout << "  ";
		//siku-siku angka dari kanan
		for(k=1; k<=i; k++){
			cout << " " << k;
		}
		
		cout << " ";
		
		//siku-siku angka dari kiri
		m=k-2;
		for(n=m; n>=1; n--)
			cout << n << " ";
		cout << endl;
	}	
}
