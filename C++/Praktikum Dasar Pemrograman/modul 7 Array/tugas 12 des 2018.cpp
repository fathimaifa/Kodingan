#include<iostream>
using namespace std;

int pola1();
int pola2();
int main(){
	int pol1, pol2;
	cout << "POLA BATIK" << endl;
	cout << endl;
	
	for(int i=0; i<21; i++){
		for(int j=0; j<25; j++){
			pola1();
			pola2();
		}
		cout << endl;
	}
}

pola1(){
	cout << "=";
}

pola2(){
	cout << "+";
}

