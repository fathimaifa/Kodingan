#include<iostream>
using namespace std;

int main()
{
	int i, j, k, l;
	
	for(i=1; i<=5; i++){
		//pengaturan jarak tampilan
		for(j=5; j>i; j--)
			cout << " ";
		//menampilkan bintang 
		for(k=i; k>=1; k--)
			cout << k;
		cout << endl;
	}
}
