#include<iostream>
using namespace std;

int main(){
	int a;
	cout << "masukan sebuah bilangan : ";
	cin >> a;
	
	if(a%2==0){
		if(a>0){
			cout << "adalah bilangan genap positif";
		}else{
			cout << "adalah bilangan genap negatif";
		}
	}else{
		if(a>0){
			cout << "adalah bilangan ganjil positif";
		}else{
			cout << "adalah bilangan ganjil negatif";
		}
	}
}
