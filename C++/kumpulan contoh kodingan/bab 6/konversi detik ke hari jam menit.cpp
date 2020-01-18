#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	int hari, detik, menit, jam;

	cout << "masukan detik : ";
	cin >> detik;
	
	hari = detik/86400;
	jam = (detik%86400)/3600;
	menit = (detik%3600)/60;
	detik = (menit%60);
	
	cout << hari << " hari, " << jam << " jam, " << menit << " menit, " << detik << " detik." << endl;
	
	getch ();
	return 0;
}
