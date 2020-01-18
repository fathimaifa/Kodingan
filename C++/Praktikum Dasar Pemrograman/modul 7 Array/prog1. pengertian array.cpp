#include<iostream>
using namespace std;

int main(){
	int A[]={2,4,6,4,5};
	//inget kalo a[} itu dimulainya dari 0, jadi A[1]=4, A[2]=6, A[3]=4, A[4]=5, A[0]=2 
	//nah disini kita mau nambahin kalau A[5} itu nilainya 7
	A[5]=7;
	
	cout << "Tampilkan semua data :" << endl;
	for(int i=0; i<=5; i++){
		cout << A[i] << " ";
	}	
}

