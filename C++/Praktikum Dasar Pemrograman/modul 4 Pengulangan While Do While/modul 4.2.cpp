#include<iostream>
using namespace std;

int main()
{
	int a, b, c, n, rata;
	
	cout << "masukan banyak bilangan : ";
	cin >> a;
	
	n = 1;
	while (n<=a)
	{
		cout << "masukan angka ke-" << n << " : ";
		cin >> b;
		
		c=c+b;
		n++;
	}
		
	rata = c/a;
	cout << "rata-rata dari semua bilangan tersebut adalah : " << rata;
}
