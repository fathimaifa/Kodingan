#include<iostream>
using namespace std;

int main()
{
	int i, j, k;
	
	for(i=5; i>=1; i--){
		//pengaturan jarak tampilan
		for(j=1; j<=i; j++)
			cout << " ";
		//menampilkan angka 
		for(k=i; k<=5; k++)
			cout << k;	
		cout << endl;
	}
}
