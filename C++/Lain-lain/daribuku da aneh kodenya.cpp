#include <iostream.h>
#include <iomanip.h>
#include <conio.h>

void main ()
{
	clrscr ();

	cout << 123.45 << endl;
	cout << setiosflags (ios::fixed) << 123.45 << endl;
	cout << 12345.6789 << endl;
	cout << resetiosflags (ios::fixed); //untuk Turbo C++
	cout << setiosflags(ios::sciencetific) << 123.45 << endl;
	cout << 12345.6789 << endl;
}


#include <conio.h>

void main()
{
	int kode_hari;

	clrscr();  //hapus layar 

	cout << "Menentukan hari" << endl;
	cout << "1= SENIN 3= RABU 5= JUM'AT 7= MINGGU" << endl;
	cout << "2= SELASA 4= KAMIS 6= SABTU" << endl;
	cout << "Kode hari (1..7)";
	cin << kode_hari;

	//proses seleksi

	if()
}
