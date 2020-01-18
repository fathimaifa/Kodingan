#include <iostream>
#include<conio.h>
using namespace std;

int main()
{
	int nilai, seribu, maratus, seratus, mapuluh, dualima;
	
	cout << "PROGRAM PENGUBAH NILAI KELIPATAN RUPIAH" << endl;
	cout << "------------------------------" << endl;
	
	cout << "masukan nilai uang (rupiah) : ";
	cin >> nilai;
	
	seribu  = nilai/1000;
	maratus = (nilai%1000)/500;
	seratus = ((nilai%1000)%500)/100;
	mapuluh = (((nilai%1000)%500)%100)/50;
	dualima = ((((nilai%1000)%500)%100)%50)/25;
	
	cout << "uang anda setara dengan pecahan : " << seribu << " buah pecahan 1000, " << maratus << " buah pecahan 500, " << seratus << " buah pecahan 100, " << mapuluh << " buah pecahan 50, " << dualima << " buah pecahan 25. ";
	
	getch();
	return 0;
	
}
