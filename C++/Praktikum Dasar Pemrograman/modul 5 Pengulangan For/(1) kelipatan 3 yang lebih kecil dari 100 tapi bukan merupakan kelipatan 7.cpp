#include<iostream>
#include<conio.h>
using namespace std;

//menampilkan bilangan kelipatan 3 yang lebih kecil dari 100 tapi bukan merupakan kelipatan 7
int main()
{
	int a;
	for(int a=3; a<=100; a=a+3)
	{
		if (a%7==0)
			continue;
		cout << a << " ";
	}
	
	getch();
	return 0;
}
