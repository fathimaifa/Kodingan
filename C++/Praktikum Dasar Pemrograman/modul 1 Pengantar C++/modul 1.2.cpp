#include <iostream>
using namespace std;

float r, c, f;

int main()
{
	cout << "PROGRAM KONVERSI SUHU DARI CELCIUS KE REAMUR DAN FAHRENHEIT" << endl;
	cout << "-----------------------------------------------------------" << endl;
	
	cout << "Suhu dalam celcius : ";
	cin >> c;
	
	r = 0.8*c;
	cout << "Suhu dalam reamur : " << r << " derajat reamur" << endl;
	f = 1.8*c+32;
	cout << "Suhu dalam fahrenheit : " << f << " derajat reamur" << endl;
	
	return 0;
}
