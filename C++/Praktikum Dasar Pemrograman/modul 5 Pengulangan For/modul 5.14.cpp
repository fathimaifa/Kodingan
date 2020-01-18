#include<iostream>
using namespace std;

int main()
{
	
int bil, total, trbesar, trkecil, rata, i, n;
 total=0;
 
 cout<<"==================================\n";
 cout<<"| <<<<<< PROGRAM BILANGAN >>>>>> |\n";
 cout<<"==================================\n\n";
 cout<<"Masukkan banyaknya bilangan : "; cin>>n;
 for(i=1; i<=n; i++){
  cout<<"Masukkan bilangan : "; cin>>bil;
  total=total+bil;
  rata=total/n;
  if(i==1){
   trbesar=bil;
   trkecil=bil;
  }
  else if(trkecil>bil){
   trkecil=bil;
  }
   else if (trbesar<bil){
    
    trbesar=bil;
   }
    else { } 
  
 }
 cout<<"\nBilangan Terbesar = "<<trbesar;
 cout<<"\nBilangan Terkecil = "<<trkecil;
 
 return 0;
 	
}


