#include <iostream>
using namespace std;

int main() {
    double perimeter;
    cout << "Enter perimeter of square: ";
    cin >> perimeter;

    double side = perimeter / 4;
    cout << "The length of the side is " << side
         << " whose perimeter is " << perimeter << endl;

    return 0;
}
