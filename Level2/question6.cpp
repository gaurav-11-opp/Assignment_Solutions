#include <iostream>
using namespace std;
int main() {
    int number1, number2;
    cout << "Enter two integers: ";
    cin >> number1 >> number2;
    int quotient = number1 / number2;
    int remainder = number1 % number2;
    cout << "The Quotient is " << quotient
         << " and Reminder is " << remainder
         << " of two number " << number1 << " and " << number2 << endl;

    return 0;
}
