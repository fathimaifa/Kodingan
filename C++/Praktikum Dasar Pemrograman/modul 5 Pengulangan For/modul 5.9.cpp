#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int a, b, c, d, n;
	cout << "masukan banyak bilangan yang akan dimunculkan : ";
	cin >> n;
	
	for(int a=1; a<=n; a++)
	{
		if(a%2==1)
		{
			cout << a << " ";
		}
		else
		{
			b=a*2;
			cout << b << " ";
		}
	}
	getch();
	return 0;
}
