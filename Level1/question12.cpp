#include <iostream>
using namespace std;

int main() {
    double base, height;
    cout << "Enter base and height (in cm): ";
    cin >> base >> height;

    double area_cm = 0.5 * base * height;
    double area_in = area_cm / (2.54 * 2.54);

    cout << "The Area of the triangle in sq in is " << area_in
         << " and sq cm is " << area_cm << endl;

    return 0;
}
