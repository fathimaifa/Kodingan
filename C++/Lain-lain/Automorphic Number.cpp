#include<iostream>
using namespace std;
int main()
{
	//variable declaration
	int s,c,p,n,i,t;
	
	cout << "PROGRAM AUTOMORPHIC NUMBER" << endl;
	cout << "--------------------------------" << endl;

	//take user input
	cout<<"Enter a number:";
	cin>>n;

	s=n*n;
	c=0;
	p=1;
	t=n;

	while(n!=0)
	{
		c++;
		n=n/10;
	}

	for(i=1;i<=c;i++)
	{
		p=p*10;
	}

	if(s%p==t)
	{
		cout<<"Number Is Automorphic";
	}

	else
	{
		cout<<"Number Is Not Automorphic";
	}
}
//ini adalah kode contekan dari apps programming hub karena aku baru belajar ngoding, dan pen ngetik di sublime tapi teu nyaho ngetik naon, tapi hayang we atuh sosoan ngetik di sublime:(
