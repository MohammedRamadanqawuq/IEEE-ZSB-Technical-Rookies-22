#include <iostream>
#include <string>
using namespace std;
int main()
{
    string frame;
    getline(cin, frame);
    int count = 0;
    string str;
    cout << "**********" << endl;
    for (int i = 0; i < frame.length(); i++)
    {
        if (i == 0)
        {
            cout << "*";
        }

        if (frame[i] != ' ')
        {
            // cout << "* ";
            str = frame[i];
            // cout <<" *";
            count++;
            cout<<str;
            cout << str;
        }
        if (frame[i] == ' ')
        {

            cout << "*";
        }
        else
        if (frame[i] == ' ')
        {
            cout << "\n";
            cout << "*";
        }

    }

    cout << "\n**********" << endl;
    return 0;
}
