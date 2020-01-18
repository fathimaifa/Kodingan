#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int a, b;
	cout << "PENDETEKSI KELIPATAN 4" << endl;
	cout << "----------------------" << endl;
	
	cout << "masukan sebuah angka : ";
	cin >> a;
	
	b = a % 4;
	
	if(b==0)
		cout << a << " merupakan kelipatan 4";
	else
		cout << a << " bukan merupakan kelipatan 4";
	
	
	getch();
	return 0;
}
