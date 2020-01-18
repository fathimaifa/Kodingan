#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int bb, bb1, tb, x, a, b;
	//x adalah rumus sementara, untuk mempermudah penulisan rumus berat badan ideal
	
	cout << "PROGRAM PENGHITUNG BERAT BADAN IDEAL" << endl;
	cout << "-------------------" << endl;
	
	cout << "masukan tinggi badan anda : ";
	cin >> tb;
	cout << "masukan berat badan anda : ";
	cin >> bb1;
	
	x = tb - 100;
	bb = x-(0.1*x);
	
	cout << "berat badan yang ideal untuk tinggi badan anda adalah : " << bb << endl;
	
	a=bb-2;
	b=bb+2;
	if((a<bb1)&&(b>bb1))
		cout << "berat badan anda ideal" << endl;
	else 
		cout << "berat badan anda tidak ideal" << endl;
	getch();
	return 0;
}
