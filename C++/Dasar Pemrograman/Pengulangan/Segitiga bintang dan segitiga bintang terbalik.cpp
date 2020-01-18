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
		for (int j=1; j<i; j++)
			cout << "*";
		cout << endl;
	}
	for(int i=1; i<=a; i++)
	{
		cout <<"*";
		for (int j=a-1; j>=i; j--)
			cout << "*";
		cout << endl;
	}
	cout << endl << endl << endl;
	cout << "segitiga terbalik juga bisa dibuat dengan kodingan yang lain\n";
	//segitiga terbalik juga bisa kaya gini kodingannya:
	
	
	
	
	
	
	for(int i=1; i<=a; i++){
		for(int j=1; j<=i; j++)
			cout << "*";
		cout << endl;
	}
	for(int i=a; i>=1; i--){
		for(int j=i; j>=1; j--){
			cout << "*";
		} cout << endl;
	}
}
