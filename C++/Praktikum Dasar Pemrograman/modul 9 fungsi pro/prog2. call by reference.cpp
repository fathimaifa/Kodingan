#include <iostream>
using namespace std;

void tukar (int &a, int &b){
	int temp;
	temp=a;
	a=b;
	b=temp;
}

int main(){
	int x=5, y=7;
	cout << "awalnya:" << endl;
	cout << "X = " << x << endl;
	cout << "Y = " << y << endl;
	
	cout << "tukarkan:" << endl;
	tukar(x,y);
	cout << "X = " << x << endl;
	cout << "Y = " << y << endl;
}

