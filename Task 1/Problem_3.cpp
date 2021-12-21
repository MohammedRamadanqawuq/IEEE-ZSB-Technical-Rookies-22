#include <iostream>
#include <algorithm>
using namespace std;
void sortingArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = size - 1; j >= 0; j--)
        {
            if (arr[i] >= arr[j])
            {
                swap(arr[i], arr[j]);
            }
        }
    }
}
int binarySearch(int arr[], int low, int high, int key)
{
    while (low <= high)
    {
        int mid = ((high - low) + 1) / 2;
        if (arr[mid] == key)
        {
            return mid;
        }
        if (arr[mid] > key)
        {
            high = mid - 1;
        }
        else
            low = mid + 1;
    }
    return -1;
}

int main()
{
    int size, key;
    cout << "Enter Array size : ";
    cin >> size;
    int arr[size];
    cout << "Enter Array elements  : ";
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    cout << "Enter Your Element you want to find  : ";
    cin >> key;
    sortingArray(arr, size);
    int result = binarySearch(arr, 0, size - 1, key);
    if (result == -1)
    {
        cout << "Sorry we can't find your key : " << key << endl;
    }
    else
        cout << arr[result] << endl;
    return 0;
}
