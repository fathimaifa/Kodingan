#include<iostream>
#include<conio.h>
using namespace std;

//menampilkan bilangan 1 sampai n dengan tanda positif dan negatif secara bergiliran
int main()
{
	int n;
	
	cout << "Masukan banyak bilangan : ";
	cin >> n;
	
	for(int a=1; a<=n; a++)
	{
		if(a%2==0)
			cout << "-" << a << " ";
		else
			cout << a << " ";
	}
	
	getch();
	return 0;
}
