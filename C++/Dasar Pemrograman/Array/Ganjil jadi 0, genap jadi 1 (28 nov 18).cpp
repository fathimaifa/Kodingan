#include<iostream>
using namespace std;

int main()
{
	int i, N;
	int b=0;
	int a[N];
	
	cout << "Banyaknya data yang akan diinput: ";
	cin >> N;
	for(i=0; i<N; i++){
		cout << "masukan nilai indeks ke-" << i << " : ";
		cin >> a[i];
		
		if (a[i]%2==0){
			a[i]=a[i]/a[i];
			cout << "hasil = " << a[i] << endl;
		}else{
			a[i]=a[i]-a[i];
			cout << "hasil = " << a[i] << endl;
		}
	}
}
