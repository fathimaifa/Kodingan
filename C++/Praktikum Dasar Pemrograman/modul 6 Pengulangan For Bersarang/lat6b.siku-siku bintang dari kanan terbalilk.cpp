#include<iostream>
using namespace std;

int main()
{
	int i, j, k;
	
	for(i=1; i<=5; i++){
		//siku-siku spasi 
		for(j=1; j<i; j++)
			cout << " ";
		//siku-siku bintang dari kanan terbalik
		for(k=5; k>=i; k--)
			cout << "*";
		cout << endl;
	}
}
