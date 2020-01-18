#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int n, a, b, c;
	
	cout << "Program Penghitung nilai ke-n deret fibonacci" << endl;
	cout << "-------------------------" << endl;
	
	cout << "masukan urutan ke-n deret fibonacci : ";
	cin >> n;
	
	a=0;
	b=1;
	
	for(int i=1; i<=n; i++)
	{
		c=a+b;
		a=b;
		b=c;
	}
	cout << "nilai deret fibonacci ke-" << n << " adalah : " << c;
}
