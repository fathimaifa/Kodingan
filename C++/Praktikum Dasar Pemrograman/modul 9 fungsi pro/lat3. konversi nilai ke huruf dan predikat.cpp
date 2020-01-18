#include <iostream>
using namespace std;

char huruf (char n){
	if(n>80||n<=100)
		cout << "A";
	else if(n>70||n<=80)
		cout << "B";
	else if(n>60||n<=70)
		cout << "C";
	else if(n>50||n<=60)
		cout << "D";
	else
		cout << "E";
	return n;
}

char predikat (char n){
	if(n>80||n<=100)
		cout << "Excellent!";
	else if(n>70||n<=80)
		cout << "Good Job!";
	else if(n>60||n<=70)
		cout << "Study Harder!";
	else if(n>50||n<=60)
		cout << "Sorry, You Failed!";
	else
		cout << "Sorry, You Failed!";
	return n;
}

int main (){
	char  nilai;
	cout << "Inputkan Nilai Anda : ";
	cin >> nilai;

	cout << "nilai anda : " << huruf(nilai) << endl;
	cout << "             " << predikat(nilai) << endl;

}
