#include<iostream>
using namespace std;

int main()
{
	int i, j;
	
	for(i=1; i<=10; i++){
		if (i%2==0)
			continue;
		for(j=i; j>=1; j-=2)
			cout << j << " ";
		cout << endl;	
	}
}
