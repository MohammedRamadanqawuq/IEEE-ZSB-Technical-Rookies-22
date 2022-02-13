#include <bits/stdc++.h>
using namespace std;
int main()
{
  int budget,key,x,usb,max=-1;  
  cin>>budget>>key>>usb;

  vector<int> a,b ;

  
  for(int i=0 ; i<key ; i++)
  { 
      cin>>x;
      a.push_back(x);
  }
  for(int j=0 ; j<usb ; j++)
  {
      cin>>x;
      b.push_back(x) ;
  }
  
  sort(a.begin() , a.end()) ;
  sort(b.begin() , b.end()) ;

  for(int i=0 ; i<key ; i++)
    for(int j=usb-1 ; j>=0 ; j--)
    {
        if(a[i]+b[j]>max && a[i]+b[j]<=budget)
        {
            max=a[i]+b[j];
            break;
        }
    }
    cout<<max;
}
