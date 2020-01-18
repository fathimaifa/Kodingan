#include <iostream>
#include <conio.h>
using namespace std;

void tulis_cplus(int jumlah);
main()
{
    tulis_cplus(3);   // untuk menampilkan tulisan c++
    getch();
}

void tulis_cplus(int jumlah)
{
    for (int i = 0; i < jumlah; i++)
        cout<<"C++"<<endl;
    cout<<"Selesai"<<endl;
}

