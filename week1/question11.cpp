#include <iostream>
using namespace std;
int main() {
    double perimeter;
    cout << "Enter the perimeter of the square: ";
    cin >> perimeter;
    double side = perimeter / 4.0;
    cout << "The length of the side is " << side 
         << " whose perimeter is " << perimeter << endl;

    return 0;
}
