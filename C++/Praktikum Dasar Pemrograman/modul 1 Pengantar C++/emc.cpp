#include <iostream>
#include <math.h>
using namespace std;

int E, m, c, cpangkat2;
int main ()
{
	cout << "MENGHITUNG NILAI E DARI RUMUS E=mc^2" << endl;
	cout << "--------------------------------" << endl;
	cout << "Masukan  nilai m : ";
	cin >> m;
	
	cout << "Masukan nilai c : ";
	cin >> c;
	cout << endl;
	
	cpangkat2=pow(c,2);
	E=m*pow(c,2);
	
	cout << "PERHITUNGAN :" << endl;
	cout << "E=mc^2" << endl;
	cout << "E=" << m << "*" << c << "^2" << endl;
	cout << "E=" << m << "*" << cpangkat2 << endl;
	cout << "E=" << E << endl << endl;
	cout << "MAKA E SAMA DENGAN " << E;
	
	return 0;
}


