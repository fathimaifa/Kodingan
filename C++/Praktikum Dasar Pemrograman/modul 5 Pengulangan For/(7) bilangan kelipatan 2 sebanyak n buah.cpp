#include<iostream>
#include<conio.h>
using namespace std;

//bilangan kelipatan 2 sebanyak n buah
int main()
{
	int n, b;
	
	cout << "Bilagan genap positif sebanyak n " << endl;
	cout << "----------------------------------" << endl;
	
	cout << "Masukan nilai n: ";
	cin >> n;
	
	for(int a=1; a<=n; a++)
	{
		b=a*2;
		cout << b << " ";
	}
	getch();
	return 0;
}
