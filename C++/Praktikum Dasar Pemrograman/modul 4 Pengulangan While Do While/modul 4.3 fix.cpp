#include<iostream>
using namespace std;

int main()
{
	int a, b, bb, tb, x, jk, perempuan, lakilaki, jwb, Y;
	
	cout << "PROGRAM CEK BERAT BADAN IDEAL" << endl;
	cout << "------------------------------" << endl;
	
	do
	{
		cout << "masukan tinggi badan anda : ";
		cin >> tb;
		
		cout << "masukan jenis kelamin anda : ";
		cin >> jk;
		
		jk = b;
		tb = a;
		
		x = tb - 100;
		bb = x - (0.1*x);
		
		if (jk==perempuan)
		{
			if (bb-3<bb<bb+3)
				cout << "berat badan anda ideal." << endl;
			else 
				cout << "berat badan anda tidak ideal." << endl;
		}
		else
		{
			if (bb-5<bb<bb+5)
				cout << "berat badan anda ideal." << endl;
			else 
				cout << "berat badan anda tidak ideal." << endl;
		}
		
		cout << "apakah anda akan nanya lagi?";
		cin >> jwb;
	}
	while (a<=200);
}
