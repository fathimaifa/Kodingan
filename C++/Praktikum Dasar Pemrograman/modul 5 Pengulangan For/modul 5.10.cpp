#include<iostream>
#include<conio.h>
using namespace std;

//bilangan faktorial
int main()
{
	int bilangan, hasil, a;
	
	cout << "Masukan bilangan untuk di faktorialkan : ";
	cin >> bilangan;
	
	hasil=1;
	for(int i=bilangan; i>=1; i--)
	{
		hasil*=i;
	}		
	cout << bilangan << "! = " << hasil;
	
	getch();
	return 0;
}
