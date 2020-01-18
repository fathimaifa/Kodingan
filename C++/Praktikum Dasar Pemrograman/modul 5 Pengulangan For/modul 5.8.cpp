#include<iostream>
#include<conio.h>
using namespace std;

//bilangan ganjil dengan tanda positif dan negatif selang-seling
int main()
{
	int n, a, b;
	
	cout << "Masukan n-bilangan : ";
	cin >> n;
	
	for (int a=1; a<=n; a++)
	{
		b=a/2;
		if(a%2==0)
			continue;
		else
		{
			if (b%2==0)
				cout << a << " ";	
			else
				cout << "-" << a << "  ";	
		}
	}
	getch();
	return 0;
}
