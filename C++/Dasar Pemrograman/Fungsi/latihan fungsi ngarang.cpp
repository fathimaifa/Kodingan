#include <iostream>
using namespace std;

void segitiga (char karakter='*');
main(){
	segitiga('&');
}

void segitiga (char karakter){
	for (int i=1; i<=5; i++){
		for (int j=1; j<=i; j++){
			cout << karakter;
		}cout << endl;
	}
}
