#include <iostream>

using namespace std;
void enterArray(int arr[], int size)
{
    cout << "Enter Array Elements : ";
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
}

void sort(int arr[], int size)
{
    int key, j;
    for (int i = 1; i < size; i++)//5 6 7 2 0
    {
        key = arr[i];//2
        j = i - 1;//2
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j -= 1;
        }
        arr[j + 1] = key;
    }
}
void displaySortedArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int size;
    cout << "Enter Array size : ";
    cin >> size;
    int arr[size];
    enterArray(arr, size);
    sort(arr, size);
    displaySortedArray(arr, size);

    return 0;
}
