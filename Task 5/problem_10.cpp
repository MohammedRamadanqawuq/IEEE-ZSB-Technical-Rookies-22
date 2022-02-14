#include<iostream>
#include<limits.h>
using namespace std;

int main()
{

    int t,n,k,a[100000+1],z;
    cin>>t;
    while(t--)
    {
        cin>>n>>k;
        z=0;
        for(int i=0; i<n; i++)
            cin>>a[i];

        for(int i=0; i<n-1; i++)
        {
            int tmp=i-1;
            if(a[i]<a[i+1])
            {

                a[i]=INT_MIN;
                ++z;
                if(z==k)
                {
                    break;

                }
                else
                {
                    while(tmp>=0)
                    {
                        if(a[tmp]==INT_MIN)
                        {
                            --tmp;
                            continue;
                        }

                        if(a[tmp]<a[i+1])
                        {
                            a[tmp]=INT_MIN;
                            ++z;
                            if(z==k)
                            {
                                i=n+1;
                                break;
                            }
                        }
                        else
                        {
                            break;
                        }
                        --tmp;
                    }
                }
            }
        }
        int p=0;
        for(int i =0; i<n-(k-z); i++)
        {
            if(a[i]!=INT_MIN)
            {
                cout<<a[i];
                if(p!=k)
                    cout<<" ";
                ++p;
            }
        }
        cout<<endl;
    }
    return 0;
}

