#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int totja, totbel, diskon;
	cout << "PROGRAM PENGHITUNG TOTAL BELANJA DAN DISKON" << endl;
	cout << "------------------------------" << endl;
	
	cout << "total uang belanja anda : ";
	cin >> totja;
	
	if (totja>100000)
	{
		cout << "Anda mendapatkan diskon sebesar 10%" << endl;
		diskon = 0.1*totja;
	}
		
	else 
	{
		cout << "anda tidak mendapatkan diskon" << endl;
		diskon = 0;	
	}
		
	totbel = totja - diskon;
	
	cout << "besar diskon yang anda dapatkan sebesar : " << diskon << endl;
	
	cout << "total belanja setelah di potong diskon : " << totbel;
	
	getch();
	return 0;
}
