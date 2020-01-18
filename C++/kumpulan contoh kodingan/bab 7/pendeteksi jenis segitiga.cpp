#include<iostream>
#include<math.h>
#include<conio.h>

using namespace std;

char opsi;


	int main()
	{
		float x, y, z, a, b, c, d;
		cout << "Masukan sisi 1 segitiga : ";
		cin >> x;
		
		cout << "Masukan sisi 2 segitiga : ";
		cin >> y;
		
		cout << "Masukan sisi 3 segitiga : ";
		cin >> z;
		
		if(x>y)
		{
			if((x>z)&&(y>z))
			{
				x=c;
				y=b;
				z=a;
			}
			else
			{
				x=c;
				y=a;
				z=b;
			}
		}
		else if(y>x)
		{
			if((y>z)&&(x>z))
			{
				x=b;
				y=c;
				z=a;
			}
			else
			{
				x=a;
				y=c;
				z=b;
			}
		}
		else
		{
			if((z>y)&&(y>x))
			{
				z=c;
				y=b;
				x=a;
			}
			else
			{
				z=c;
				y=a;
				x=b;
			}
		}
		d=pow(c,2);
		d=(pow(a,2)+pow(b,2));
		if(d>(pow(a,2)+pow(b,2)))
		{
			cout << "segitiga tersebut merupakan segitiga tumpul." << endl;
		}
		else if(d<(pow(a,2)+pow(b,2)))
		{
			cout << "segitiga tersebut merupakan segitiga lancip." << endl;
		}
		else
		{
			cout << "segitiga tersebut merupakan segitiga siku siku." << endl;
		}
		
		getch();
		return 0;	
	}
