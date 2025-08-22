#include <iostream>
using namespace std;

int main() {
    double unitPrice;
    int quantity;
    cout << "Enter unit price and quantity: ";
    cin >> unitPrice >> quantity;

    double total = unitPrice * quantity;

    cout << "The total purchase price is INR " << total
         << " if the quantity " << quantity
         << " and unit price is INR " << unitPrice << endl;

    return 0;
}
