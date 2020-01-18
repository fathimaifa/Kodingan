#include<iostream>
using namespace std;

int jamasuk, jamkeluar, menitmasuk, menitkeluar, sm1, sm2, sj1, sj2;
int main()
{
	cout << "PROGRAM SELISIH WAKTU KELUAR DAN MASUK" << endl;
	cout << "----------------------" << endl;
	
	cout << "Jam anda masuk : ";
	cin >> jamasuk;
	
	cout << "Menit anda masuk : ";
	cin >> menitmasuk;
	
	cout << "Jam anda keluar : ";
	cin >> jamkeluar;
	
	cout << "Menit anda keluar : ";
	cin >> menitkeluar;
	
	cout << "..." << endl;
	
	cout << "Anda masuk pada pukul : " << jamasuk << "." << menitmasuk << endl;
	cout << "Anda keluar pada pukul : " << jamkeluar << "." << menitkeluar << endl;
	
	sm1=menitkeluar-menitmasuk;
	//selisih menit
	if(sm1<0)
		sm2=(60-menitmasuk)+menitkeluar;
	else
		sm2=menitkeluar-menitmasuk;
		
	sj1=jamkeluar-jamasuk;
	//selisih jam
	if(sm1<0)
		sj2=jamkeluar-jamasuk-1;
	else
		sj2=jamkeluar-jamasuk;
		
	cout << "\nSELISIH WAKTU ADALAH\n" << endl;
	
	if(sj2==0)
		cout << "Selisih waktu masuk dan keluar anda : " << sm2 << " menit" << endl;
	else
		cout << "Selisih waktu masuk dan keluar anda : " << sj2 << "." << sm2 << endl;
}
