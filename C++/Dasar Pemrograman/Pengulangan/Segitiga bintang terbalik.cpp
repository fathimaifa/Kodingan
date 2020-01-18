#include<iostream>
using namespace std;

int main()
{
	int a;
	cout << "masukan jumlah tinggi bintang : ";
	cin >> a;
	
	for(int i=1; i<=a; i++)
	{
		cout <<"*";
		for (int j=a-1; j>=i; j--)
			cout << "*";
		cout << endl;
	}
}
