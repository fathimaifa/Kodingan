#include<iostream>
#include<conio.h>
using namespace std;

//menampilkan bilangan 1 dan negatif 1 secara bergantian sebanyak-n kali
int main()
{
	int n;
	
	cout << "Masukan n-bilangan : ";
	cin >> n;
	
	for(int a=1; a<=n; a++)
	{
		if(a%2==0)
			cout << "-1  ";
		else
			cout << "1 ";
	}
	
	getch();
	return 0;
}
