#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int bb, tb, x;
	//x adalah rumus sementara, untuk mempermudah penulisan rumus berat badan ideal
	
	cout << "PROGRAM PENGHITUNG BERAT BADAN IDEAL" << endl;
	cout << "-------------------" << endl;
	
	cout << "masukan tinggi badan anda : ";
	cin >> tb;
	
	x = tb - 100;
	bb = x-(0.1*x);
	
	cout << "berat badan yang ideal untuk tinggi badan anda adalah : " << bb;
	
	getch();
	return 0;
}
