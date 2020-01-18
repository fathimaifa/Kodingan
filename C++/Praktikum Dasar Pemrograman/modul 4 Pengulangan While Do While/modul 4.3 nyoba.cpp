#include<iostream>
using namespace std;

int main()
{
	int bb, tb, x, jk, perempuan, lakilaki, jwb, Y;
	
	cout << "PROGRAM CEK BERAT BADAN IDEAL" << endl;
	cout << "------------------------------" << endl;
	
	do
	{
		cout << "masukan jenis kelamin anda : ";
		cin >> jk;
		
		cout << "masukan tinggi badan anda : ";
		cin >> tb;
		
		x = tb - 100;
		bb = x - (0.1*x);
		
		cout << "apakah anda mau nyoba lagi?";
		cin >> jwb;
	}
	
	while (jwb==Y);
}
