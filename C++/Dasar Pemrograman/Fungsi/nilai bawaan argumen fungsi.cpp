#include <iostream>
#include <conio.h>
using namespace std;

// Prototipe fungsi dan penyetelan nilai bawaan
// pada argumen kedua
void ulang(char karakter = '-', int jumlah = 10);
main()
{
    ulang ('*',5);
    ulang ('+');
    ulang ();
    getch();
}

void ulang(char karakter, int jumlah)
{
    for (int i = 0; i < jumlah; i++)
        cout<<karakter;
    cout<<endl;
} 
