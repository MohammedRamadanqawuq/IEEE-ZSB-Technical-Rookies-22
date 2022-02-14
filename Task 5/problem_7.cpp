#include <iostream>

using namespace std;

int main()
{
    int n,l, length, topics = 0,maxt = 0, temp = 0, change = 0;
    string m[500] = {};
    int teams[500] = {};
    cin >> n >> l;
    for (int x = 0; x < n; x++)
    {
        cin >> m[x];
    }
    for (int x = 0; x < n; x++)
    {
        for (int j = x + 1; j < n; j++)
        {
            topics = 0;
            for (int i = 0; i < l; i++)
            {
                if (m[x][i] == '1' || m[j][i] == '1')
                {

                    topics++;
                    if (temp < topics)
                    {
                        temp = topics;
                    }
                }
            }
            if (temp == topics)
            {
                teams[temp]++;
            }
        }
    }
    cout << temp << endl;
    cout << teams[temp];
    return(0);
}
