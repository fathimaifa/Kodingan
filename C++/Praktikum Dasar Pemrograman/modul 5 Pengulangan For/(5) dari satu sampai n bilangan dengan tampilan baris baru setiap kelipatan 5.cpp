#include<iostream>
#include<conio.h>
using namespace std;

//menampilkan bilangan dari satu sampai n bilangan dengan tampilan baris baru setiap kelipatan 5
int main()
{
	int n;
	
	cout << "Masukan banyak bilangan : ";
	cin >> n;
	
	for(int a=1; a<=n; a++)
	{
		if(a%5==0)
		{
			cout << a << " " <<  endl;
		}
		else
		{
			cout << a << " ";
		}
	}
}
