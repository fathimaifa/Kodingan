#include<iostream>
using namespace std;

int maks(int a, int b){
	int bilterbesar;
	if (a>b)
		bilterbesar=a;
	else
		bilterbesar=b;
	return bilterbesar;
}

int main(){
	int bilangan1, bilangan2;
	cout << "Input Bilangan 1  : ";
	cin >> bilangan1;
	cout << "Input Bilangan 2  : ";
	cin >> bilangan2;
	
	cout << "HASIL:" << endl;
	cout << "Bilangan Terbesar : " << maks(bilangan1, bilangan2);
}
