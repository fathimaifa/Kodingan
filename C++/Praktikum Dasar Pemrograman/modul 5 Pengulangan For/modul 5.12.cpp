#include<iostream>
using namespace std;

//mengetahui nilai deret fibonacci dengan urutan ke-n
int main()
{
	int n, a, fx1, fx2, fx;
	cout << "Masukan jumlah angka yang akan muncul dalam deret fibonacci : ";
	cin >> n;
	
	fx1=0;
	fx2=1;
	cout << "1 ";
	for(a=1; a<=n; a++)
	{
		fx=fx1+fx2;
		fx1=fx2;
		fx2=fx;
		cout << fx << " ";
	}
	cin.get();
	return 0;
}
