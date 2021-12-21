#include <iostream>

using namespace std;
void loopfun(int n, int arr[])
{

    int sum = 0;
    for (int i = 0; i < n; i++)
    {

        sum += arr[i];
    }
    cout << sum << endl;
}
void whiloop(int n, int arr[])
{

    int sum = 0, i = 0;
    while (i < n)
    {

        sum = sum + arr[i];
        i++;
    }
    cout << sum << endl;
}
int recur(int N, int arr[])
{
    while (N <= 0)
    {
        return 0;
    }
    return (recur(N - 1, arr) + arr[N - 1]);
}
int main()
{
    int n, number;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    loopfun(n, arr);
    whiloop(n, arr);
    int r = recur(n, arr);
    cout << r << endl;
    return 0;
}
