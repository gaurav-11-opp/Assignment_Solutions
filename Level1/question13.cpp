#include <iostream>
using namespace std;
int main() {
    double unitPrice;
    int quantity;
    cout << "Enter the unit price of the item: INR ";
    cin >> unitPrice;
    cout << "Enter the quantity: ";
    cin >> quantity;
    double totalPrice = unitPrice * quantity;
    cout << "The total purchase price is INR " << totalPrice 
         << " if the quantity is " << quantity 
         << " and unit price is INR " << unitPrice << endl;

    return 0;
}
