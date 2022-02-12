#include <iostream>

using namespace std;
class Node
{
public:
    int Data;
    Node *next;
};
class LinkedList
{
public:
    Node *temp;
    Node *head;
    Node *newnode;
    LinkedList()
    {
        head = NULL;
    }
    bool Isempty()
    {
        return (head == NULL);
    }
    void insertFirst(int newvalue)
    {

        if (Isempty())
        {
            newnode->Data = newvalue;
            head = newnode;
            newnode->next = NULL;
        }
        //   else
        //{
        newnode->Data = newvalue;
        newnode->next = head;
        head = newnode;
        // }
    }
    void insertAtEnd(int newValue)
    {
        temp = newnode;
        temp->next = NULL;
    }
    void display()
    {
        // Node *temp;
        // temp = head;

        while (temp != NULL)
        {
            cout << temp->Data << " ";
            temp = temp->next;
        }
    }
    int counter()
    {

        temp = head;
        int count = 0;
        while (temp != NULL)
        {

            count++;
            temp = temp->next;
        }
        return count;
    }
    void Isfound(int key)
    {
        temp = head;
        while ((temp->next != NULL))
        {
            if (temp->Data == key)
            {
                cout << "The Item is Found \n";
            }
            else
            {
                cout << "The Item is not found \n";
            }
            temp = temp->next;
        }
    }
};

int main()
{
    LinkedList linked;
    if (linked.Isempty())
    {
        cout << "The linked list is Empty \n";
    }
    else
    {

        cout << "number of elements in linked list is " << linked.counter() << "\n";
    }
    cout << "Note that \n if you want to insert at first position Enter number 1 ! \n if you want to insert inside position Enter number 2 ! \n if you want to insert in the last position Enter number 3 ! \n";
    cout << "What is the position you want ? ";
    int position;
    cin >> position;
    cout << "Enter your item you want to insert : ";
    int newitem;
    cin >> newitem;
    if (position == 1)
    {
        linked.insertFirst(newitem);
        linked.display();
    }
    else if (position == 3)
    {
        linked.insertAtEnd(newitem);
        linked.display();
    }
    cout << linked.counter() << endl;

    return 0;
}
