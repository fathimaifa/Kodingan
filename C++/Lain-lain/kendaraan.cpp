#include <iostream>
#include <conio.h>
#include <string.h>

class kendaraan
{
private:
	char nama[15];
public:
	kendaraan (char *nama_kendaraan = "XXX")
	{
		strcpy(nama, nama_kendaraan);
		cout << "Hidupkan Mesin Kendaraan Anda..." << endl;
	}
	-kendaraan()
	{
		cout << "Matikan Mesin Kendaraan Anda...." << endl;
	}
	void info_kendaraan()
	{
		cout << nama << "sedang berjalan..." << endl;
	}
};

class Truk : public kendaraan 
{
public:
	Truk (char *nama_truk) : Kendaraan(nama_truk)
	{
		cout << "Hidupkan Mesin Truk Anda..." << endl;
	}
	-Truk()
	{
		cout << "Matikan Mesin Truk Anda...." << endl;
	}
};

void main() {
	clrscr();  //hapus layar 
	truk fuso ("TRUK FUSO");

	fuso.info kendaraan();
	cout << "Akhir main()...." << endl;
}
