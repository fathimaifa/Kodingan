#include <iostream> 
#include <conio.h> 
int main(){
 int batas, x, cek, i;
 
 cout<<"PROGRAM UNTUK MENAMPILKAN DERET BILANGAN PRIMA"<<endl;
 cout<<"Tampilkan Sampai Batas Atas : ";
 cin>>batas;
 cout<<endl;
 cout<<"Deret Bilangan Prima sampai angka "<<batas<<" adalah: "<<endl<<endl;
 
 for (x = 2; x<=batas; x++){
    cek = 0;
  for (i = 2; i < x; i++){
       if (x % i == 0){
          cek = 1;
         }
      }
      if (cek == 0){
       cout<<x<<", ";
      }
   }
}

 
cout<<endl<<endl<<endl;
cout<<" http://jintoples.blogspot.com"<<endl;
 
}
 
getch();
 
}

