#include <iostream>
using namespace std;

int main() {
    double number1, number2;
    cout << "Enter two numbers: ";
    cin >> number1 >> number2;

    double addition = number1 + number2;
    double subtraction = number1 - number2;
    double multiplication = number1 * number2;
    double division = number1 / number2;

    cout << "The addition, subtraction, multiplication and division value of 2 numbers "
         << number1 << " and " << number2 << " is "
         << addition << ", " << subtraction << ", " << multiplication << ", " << division << endl;

    return 0;
}
