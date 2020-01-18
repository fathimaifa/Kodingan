#include <iostream>
#include <conio.h>
#include <string.h>

struct data
    {
           string nip[12],nama[12];
           int i, menu;
    };
data biodata;
void input()
{
   cout <<"Masukkan banyak data : ";cin>>biodata.i;
   for(int a=1;a<=biodata.i;a++)
   {
       cout <<"Masukkan NIP  : ";cin>>biodata.nip[a];
       cout <<"Masukkan Nama : ";cin>>biodata.nama[a];
   }
}
void tampil(){
   cout <<endl<<"Data yang sudah masuk : "<<endl;
   for(int a=1;a<=biodata.i;a++)
    {
        cout <<"NIP  : "<<biodata.nip[a]<<endl;
        cout <<"Nama : "<<biodata.nama[a]<<endl<<endl;
    }
      getch();
}
void main()
{
do{
clrscr();
   cout<<"1. Input"<<endl;
   cout<<"2. Tampil"<<endl;
   cout<<"3. Keluar"<<endl;
   cout<<"Menu : ";cin>>biodata.menu;
   switch(biodata.menu){
      case 1: input();break;
      case 2: tampil();break;
   }
}while(biodata.menu!=3);
getch();
}

