#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int bilangan1, bilangan2, bilangan3;
	cout << "PROGRAM PENGURUT BILANGAN BULAT" << endl;
	cout << "----------------------" << endl;
	
	cout << "masukan bilangan 1 : ";
	cin >> bilangan1;
	
	cout << "masukan bilangan 2 : ";
	cin >> bilangan2;
	
	cout << "masukan bilangan 3 : ";
	cin >> bilangan3;
	
	if (bilangan1>bilangan2)
	{
		if ((bilangan1>bilangan3)&&(bilangan2>bilangan3))
		{
			cout << bilangan3 << " ";
			cout << bilangan2 << " ";
			cout << bilangan1 << " ";	
		}
		else if ((bilangan1>bilangan3)&&(bilangan3>bilangan2))
		{
			cout << bilangan2 << " ";
			cout << bilangan3 << " ";
			cout << bilangan1 << " ";	
		}
	}
	
	else if (bilangan2>bilangan3)
	{
		if ((bilangan2>bilangan1)&&(bilangan1>bilangan3))
		{
			cout << bilangan3 << " ";
			cout << bilangan1 << " ";
			cout << bilangan2 << " ";
			
		}
		else if ((bilangan2>bilangan1)&&(bilangan3>bilangan1))
		{
			cout << bilangan1 << " ";
			cout << bilangan3 << " ";
			cout << bilangan2 << " ";	
		}
	}
		
	else
	{
		if (bilangan2>bilangan1)
		{
			cout << bilangan1 << " ";
			cout << bilangan2 << " ";
			cout << bilangan3 << " ";
		}
		else
		{
			cout << bilangan2 << " ";
			cout << bilangan1 << " ";
			cout << bilangan3 << " ";
		}
	}
		
	getch();
	return 0;
}
