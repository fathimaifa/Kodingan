#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;

//menampilkan nilai fungsi f(x)=x^2-2x-8 dengan nilai x diinput sebanyak n kali
int main()
{
	float n, fx;
	
	cout << "Masukan banyak bilangan : ";
	cin >> n;
	
	for (int x=1; x<=n; x++)
	{
		fx=pow(x,2)-(2*x)-8;
		cout << "f(" << x << ")"<< "f(x)=x^2-2x-8" << " = " << fx << endl;
	}
	
	getch();
	return 0;
}
