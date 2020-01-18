
#include<iostream>
using namespace std;

int main()
{
	int t1, t2;
	
	cout << "masukan tahun awal : ";
	cin >> t1;
	
	cout << "masukan tahun akhir : ";
	cin >> t2;
	
	while (t1<t2)
	{
		if (t1%4==0)
			cout << t1 << endl;
		else if (t1%4==1)
		{
			t1=t1+3;
			cout << t1 << endl;
		}
		else if (t1%4==2)
		{
			t1=t1+2;
			cout << t1 << endl;
		}
		else
		{
			t1=t1+1;
			cout << t1 << endl;
		}
		
		t1++;
	}
}
