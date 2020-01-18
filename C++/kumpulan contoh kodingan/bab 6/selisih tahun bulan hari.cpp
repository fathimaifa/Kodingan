#include<iostream>
using namespace std;

int main()
{
	char opsi;
	do
	{
		system("cls");
		
		struct{
			int hari, bulan, tahun;
		}pertama, kedua;
		
		struct{
			int hari, bulan, tahun;
		}selisih;
		
		cout << "masukan tanggal pertama(dd:mm:yy)\n\n";
		cout << "hari = ";
		cin >> pertama.hari;
		
		cout << "bulan = ";
		cin >> pertama.bulan;
		
		cout << "tahun = ";
		cin >> pertama.tahun;
	
		cout << "..." ;
		
		cout << "\n\nMasukan tanggal kedua (dd:mm:yy) \n\n";
		cout << "hari = ";
		cin >> kedua.hari;
		
		cout << "bulan = ";
		cin >> kedua.bulan;
		
		cout << "tahun = ";
		cin >> kedua.tahun;
		
		selisih.tahun = pertama.tahun - kedua.tahun;
		selisih.bulan = pertama.bulan - kedua.bulan;
		selisih.hari = pertama.hari - kedua.hari;
		
		if(selisih.tahun<0){
			selisih.tahun = selisih.tahun*-1;
		}
		else if(selisih.bulan<0){
			selisih.bulan = selisih.bulan*1;
		}
		else if(selisih.hari<0){
			selisih.hari = selisih.hari*-1;
		}
		
		cout << "\nSelisih = " << selisih.tahun << " tahun " << selisih.bulan << " bulan " << selisih.hari << " hari ";
		
		cout << "\n\nApakah anda ingin keluar?" << endl;
		cout << "ketik y atau n";
		cin >> opsi;	
	}while(opsi=='n'||opsi=='N');
}
