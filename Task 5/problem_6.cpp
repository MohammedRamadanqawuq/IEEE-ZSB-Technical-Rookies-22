#include <iostream>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

int main()
{
  int n;
    cin >> n;
    vector<int> s(n);
    for(int i = 0;i < n;i++){
       cin >> s[i];
    }
    int m;
    cin >> m;
    vector<int> a(m);
    for(int i = 0;i < m;i++){
       cin >> a[i];
    }
    
    vector<int> r(n);
    int rnk=1;
    r[0]=rnk;
    for(int i=1; i<n; i++){
        if(s[i]==s[i-1]) r[i]=rnk;
        else r[i] = ++rnk;
    }
    int j=0;
    for(int i=n-1; i>0 && j<m; i--){
        if (s[i] >= a[j]) {cout << r[i]+(s[i]>a[j]) << endl; j++; i++;} 
    }
    while(j<m){cout << 1+(s[0]>a[m-1]) << endl; j++;}
    return 0;
}
