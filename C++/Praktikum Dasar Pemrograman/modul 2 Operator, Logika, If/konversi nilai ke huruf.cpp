#include<iostream>
using namespace std;


int main ()
{
	int n;
	
	cout << "PROGRAM KONVERSI NILAI KE HURUF" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "Masukan nilai Anda : ";
	cin >> n;
	
	if(n>=80)
		cout << "Nilai anda : A";
	else if(n>=65)
		cout << "Nilai anda : B";
	else if(n>=55)
		cout << "Nilai anda : C";
	else if(n>=45)
		cout << "Nilai anda : D";
	else if(n>=0)
		cout << "Nilai anda : E";
}
