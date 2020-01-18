#include <iostream>
using namespace std;

int main (){
	struct dataMhz{
		char nama[20];
		long int nim;
		float nilai;
		int umur;
	};
	dataMhz mhs[10];
	int z,n;
	 cout<<"banyak mahasiswa: ";
	 cin>>n;
	cout<<"Masukkan Data Mahasiswa\n";
	cout<<"----------------------\n";

	for(z=0;z<n;z++){
		cout<<"\nMahasiswa ke-"<<(z+1)<<"\n";
		cout<<"----------------\n";
		cout<<"Nama : ";cin>>mhs[z].nama;
		cout<<"Umur: ";cin>>mhs[z].umur;
		cout<<"Nilai: ";cin>>mhs[z].nilai;
		
	}
	
	cout<<"No.\tNama\t\tNIM\t\tUmur\tTotal Nilai\tNilai huruf\n";
	cout<<"-----------------------------------------------\n";
	for(z=0;z<n;z++){
		cout<<(z+1)<<"\t"<<mhs[z].nama<<"\t\t";
		if(z<9){
		
		cout<<"118705000"<<(z+1);
	}
		else{
			cout<<"11870500"<<(z+1);
		}
		cout<<"\t"<<mhs[z].umur<<"\t"<<mhs[z].nilai<<"\t\t";
		if(mhs[z].nilai<100 && mhs[z].nilai>50){
			cout<<"A";
		}
		else if(mhs[z].nilai>0 && mhs[z].nilai<=50){
			cout<<"B";
		}
		cout<<endl;
		
	}
}
