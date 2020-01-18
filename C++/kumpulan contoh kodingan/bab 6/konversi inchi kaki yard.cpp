#include <iostream>
#include<conio.h>

using namespace std;

int main()
{
	float m, cm, mm, inchi, kaki, yard;
	cout << "konversi meter ke inchi, kaki, yard." << endl;
	cout << "-----------------" << endl;
	
	cout << " masukan panjang benda dalam meter : ";
	cin >> m;
	
	inchi = m/25400;
	kaki = m/3048;
	yard = m/0.9144;
	
	cout << "m = " << inchi << " inchi\n";
	cout << "m = " << kaki << " kaki\n";
	cout << "m = " << yard << " yard\n";
	
	getch();
	return 0;
}
