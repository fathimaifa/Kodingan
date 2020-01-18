#include<iostream>
using namespace std;

int main()
{
	int i, j, k;
	
	for(i=5; i>=1; i--){
		//pengaturan jarak tampilan
		for(j=5; j<=i; j--)
			cout << " ";
		//menampilkan bintang 
		for(k=5; k>=i; k--)
			cout << "*";
		cout << endl;
	}
}
