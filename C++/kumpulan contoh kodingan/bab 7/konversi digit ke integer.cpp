#include<iostream>
#include<stdlib.h>

using namespace std;

int main()
{
	char num [256];
	cout << "konversi digit ke integer." << endl;
	cout << "------------------" << endl;
	
	cout << "masukan karakter : ";
	cin >> num;
	
	if(atoi(num))
	{
		int hasil = atoi(num);
		cout << "anda memasukan angka : " << hasil;
	}
	else
	{
		cout << "anda menginput angka : " << -1;
	}
}
