#include<iostream>
#include<math.h>
using namespace std;

int a, b, c;
int main()
{
	cout << "Masukan sisi1 : ";
	cin >> a;
	
	cout << "Masukan sisi2 : ";
	cin >> b;
	
	cout << "Masukan sisi3 : ";
	cin >> c;
	
	if(a==sqrt((b*b)+(c*c)))
		cout << "Panjang sisi " << a << " " << b << " dan " << c << " Dapat membuat segitiga siku-siku.";
	else if(b==sqrt((a*a)+(c*c)))
		cout << "Panjang sisi " << a << " " << b << " dan " << c << " Dapat membuat segitiga siku-siku.";
	else if(c==sqrt((b*b)+(a*a)))
		cout << "Panjang sisi " << a << " " << b << " dan " << c << " Dapat membuat segitiga siku-siku.";
	else 
		cout << "Tidak dapat membuat segitiga siku-siku.";
}
