#include<iostream>
using namespace std;

int a, b, c;
/* a = total belanja
   b = besar potongan harga 
   c = total belanja setelah didiskon */
   
int main()
{
	cout << "PROGRAM PENGHITUNG DISKON BELANJA" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "Masukan total belanja anda : ";
	cin >> a;
	
	cout << "..." << endl;
	
	if (a>=500000)
	{
		b=a*0.1;
		cout << "Anda mendapatkan potongan harga sebesar : Rp." << b << endl;
		
		c=a-b;
		cout << "Total belanja setelah di diskon sebesar : Rp." << c;
	}
	
	else if (a>=250000)
	{
		b=a*0.05;
		cout << "Anda mendapatkan potongan harga sebesar : Rp." << b << endl;
		
		c=a-b;
		cout << "Total belanja setelah di diskon sebesar : Rp." << c;
	}
	
	else 
		cout << "Maaf, Anda tidak mendapatkan diskon.";
	
}
