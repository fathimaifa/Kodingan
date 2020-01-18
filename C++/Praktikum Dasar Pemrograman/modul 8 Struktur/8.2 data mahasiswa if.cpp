#include<iostream>
using namespace std;

main()
{
	int z;
	cout<<"DATA MAHASISWA TEKNIK INFORMATIKA\n";
	cout<<"---------------------------------\n";
	
	struct dataMhs
	{
		char nama[10];
		long int nim;
		int umur;
		char nilaihuruf;
		float totalnilai;
	};
	
	dataMhs mhs[10];
	cout<<"Data yang harus diisi\n";

	for(z=0; z<3; z++)
	{
		cout<<"\nMahasiswa ke-"<<(z+1)<<"\n";
		cout<<"-------------\n";
		cout<<"Nama  : ";
		cin>>mhs[z].nama;
		cout<<"NIM  : ";
		cin>>mhs[z].nim;
		cout<<"Umur  : ";
		cin>>mhs[z].umur;
		cout<<"Total Nilai  : ";
		cin>>mhs[z].totalnilai;
		cout<<"Nilai huruf  : ";
		cin>>mhs[z].nilaihuruf;
		cout<<endl;
	}
	
	cout<<"		DATA NILAI MAHASISWA TEKNIK INFORMATIKA		";
	cout<<endl;
	cout<<"***********************************************\n";
	cout<<"no|	nama	|	nim		|	umur	|	total nilai	|	nilai huruf	|\n";
	for(z=0; z<3; z++)
	{
		cout<<(z+1)<<"\t"<<mhs[z].nama<<"\t"<<mhs[z].nim<<"\t"<<mhs[z].umur<<"\t"<<mhs[z].totalnilai;
	}
	
	

	
	
	
	
}
