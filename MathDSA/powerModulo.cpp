#include<iostream>
using namespace std;

int findPowMod(int a, int b, int m) {
    int res = 1;
    while(b!=0) {
        if(b&1) 
            res = (1LL * res * (a%m))%m;
        a = (1LL * a%m * a%m)%m;
        b>>=1;    
    }
    return res;
}

int main()
{
    //(a^b)%m
    int a,b,m;
    cin>>a;
    cin>>b;
    cin>>m;
    int res = findPowMod(a,b,m);
    cout<<a<<" ^ "<<b<< " % "<<m<< " = "<<res<<endl;
}