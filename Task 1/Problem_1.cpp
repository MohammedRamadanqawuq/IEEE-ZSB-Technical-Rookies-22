#include <iostream>

using namespace std;

int main()
{
    long long width, length, area, perimeter;
    cin >> width >> length;
    area = width * length;
    perimeter = (width + length) * 2;
    cout << area << "\n"
         << perimeter << endl;
    return 0;
}
