#include <iostream>
#include <conio.h>
using namespace std;

long pangkat(int x, int n);
main()
{
    int x,y;
    
    cout<<"Menghitung x ^ y"<<endl;
    cout<<"x = ";
    cin>>x;
    cout<<"y = ";
    cin>>y;
    cout<<x<<"^"<<y<<" = "<<pangkat(x,y)<<endl;
    getch();
}

long pangkat(int x, int n)
{ 
    if (n==1)
        return (x);
    else
        return (x*pangkat(x,n-1));
}
