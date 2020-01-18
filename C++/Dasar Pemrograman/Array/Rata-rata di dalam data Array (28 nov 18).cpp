#include<iostream>
using namespace std;

int main()
{
	int n;
	float jumlah=0;
	cout << "banyak data : ";
	cin >> n;
	
	int a[n];
	
	for(int i=0; i<n; i++)
	{
		cout << "data ke-" << i+1 << " : ";
		cin >> a[i];
		jumlah = jumlah + a[i];
	}
	cout << "rata-rata adalah : " << jumlah/n;
}

//keterangan:
/*
macam macam bentuk array:
1. bentuk int langsung
	int a[4]={5,6,7,1};
	cin >> a[0];
	cin >> a[1];
	cin >> a[2];
	cin >> a[3];

2. bentuk gini		
	a[0]=5;
	a[1]=6;
	a[2]=7;
	a[3]=1;

3.bentuk for (buat kalau yang inputnya banyakkkk banget)	
	for (int i=0; i<4; i++)
		cin>>a[i];
*/

