#include<iostream>
using namespace std;

int main()
{
	int i, j ,k;
	
	for(i=1; i<=5; i++){
		//siku-siku spasi terbalik
		for(j=5; j>=i; j--)
			cout << " ";
		//sama kaki bintang
		for(k=1; k<=i; k++)
			cout << "* ";
		cout << endl;
	}
}
