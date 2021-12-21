#include <iostream>

using namespace std;

int main()
{
    long long N, sum = 0;
    cin >> N;
    for (int i = 1; i <= N; i++)
    {
        if (i % 3 == 0 || i % 5 == 0)
        {
            sum = sum + i;
        }
    }
    cout << sum << endl;

    return 0;
}
