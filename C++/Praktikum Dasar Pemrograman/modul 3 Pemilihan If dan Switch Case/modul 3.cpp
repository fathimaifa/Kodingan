#include <iostream>
using namespace std;

int main()
{
	int a, b, c;
	cout << "Program Penyusun Bilangan" << endl;
	cout << "-------------------------------" << endl;
	
	cout << "masukan bilangan 1 : ";
	cin >> a;
	
	cout << "masukan bilangan 2 : ";
	cin >> b;
	
	cout << "masukan bilangan 3 : ";
	cin >> c;
	
	cout << "..." << endl;
	if(a>b)
		if(a>c)
			cout << "bilangan terbesar adalah : " << a;
		else
			cout << "bilangan terbesar adalah : " << c;
			
	else if(b>a)
		if(b>c)
			cout << "bilangan terbesar adalah : " << b;
		else
			cout << "bilangan terbesar adalah : " << c;
	else
		cout << "bilangan terbesar adalah : " << c;
			
}
