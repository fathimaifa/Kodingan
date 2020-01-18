#include<iostream>
using namespace std;

int bil1, bil2;
int main()
{
	cout << "CEK BILANGAN KELIPATAN" << endl;
	cout << "--------------------------------" << endl;
	
	cout << "Masukan bilangan1 : ";
	cin >> bil1;
	cout << "Masukan bilangan2 : ";
	cin >> bil2;
	
	if(bil1%bil2==0)
		cout << "Bilangan1 merupakan kelipatan dari bilangan2.";
	else if (bil2%bil1==0)
		cout << "Bilangan2 merupakan kelipatan dari bilangan1.";
	else 
		cout << "Kedua bilangan tersebut bukan merupakan kelipatan.";
}
