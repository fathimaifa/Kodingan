#include<iostream>
using namespace std;

int main()
{
	int i, j;
	
	for(i=8; i>=0; i--){
		if (i%2!=0)
			continue;
		for(j=i; j<=8; j+=2)
			cout << j << " ";
		cout << endl;	
	}
}
