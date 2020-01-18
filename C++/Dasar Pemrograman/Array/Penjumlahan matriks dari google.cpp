    #include <iostream>
    using namespace std;
    int main(){
        int x,y,a[3][4],b[3][4];
     
        cout<<"## Matrix 1 ##"<<endl;
        for (x=0;x<=2;x++){
            for (y=0;y<=3;y++){
                cout<<"Masukkan Index ("<<x<<","<<y<<") = ";
                cin>>a[x][y];
            }
        }
        cout<<endl<<"## Matrix 2 ##"<<endl;
        for (x=0;x<=2;x++){
            for (y=0;y<=3;y++){
                cout<<"Masukkan Index 2 ("<<x<<","<<y<<") = ";
                cin>>b[x][y];
            }
        }
        cout<<endl<<"## Matrix 1 + Matrix 2 ##"<<endl;
        for (x=0;x<=2;x++){
            cout<<endl;
            for (y=0;y<=3;y++){
                cout<<a[x][y]+b[x][y]<<" ";
            }
        }
        return 0;
    }
