#include<iostream> 
#include<conio.h> 

int main() 
{ 
float a[max],jumlah=0,rata_rata; 
int j; 

//Memasukkan nilai ke dalam elemen array 
// \n\n" berfungsi sama seperti endl 
cout<<"Masukkan Nilai : \n\n"; 
for(j=0;j<max;j++) 
{ 
cout<<"A["<<j<<"]= "; 
cin>>a[j]; 
jumlah=jumlah + a[j]; 
} 
//Melakukan Proses perhitungan 
rata_rata=jumlah/max; 
cout<<endl; 

//Menampilkan Hasil Perhitungan 
cout<<"Nilai Rata-Rata= "<<rata_rata; 
getch(); 
} 
