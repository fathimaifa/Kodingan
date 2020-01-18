#include<iostream>
using namespace std;

int a, b;
int main()
{
	cout << "PROGRAM PENGECEK BILANGAN GENAP DAN GANJIL" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "masukan angka yang anda inginkan : ";
	cin >> a;
	
	
	
	if(a%2==0)
		cout << "Bilangan tersebut GENAP";
	else
		cout << "Bilangan tersebut GANJIL";
}
