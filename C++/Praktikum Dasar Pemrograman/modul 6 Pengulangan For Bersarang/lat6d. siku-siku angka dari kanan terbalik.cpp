#include<iostream>
using namespace std;

int main()
{
	int i, j, k;
	
	for(i=5; i>=1; i--){
		//siku-siku spasi 
		for(j=5; j>i; j--)
			cout << " ";
		//siku-siku bintang dari kanan terbalik
		for(k=i; k>=1; k--)
			cout << k;
		cout << endl;
	}
}
