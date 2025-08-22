#include <iostream>
using namespace std;

int main() {
    double heightCm;
    cout << "Enter your height in centimeters: ";
    cin >> heightCm;
    double totalInches = heightCm / 2.54;
    int feet = totalInches / 12;
    int inches = (int)totalInches % 12;
    cout << "Your Height in cm is " << heightCm
         << " while in feet is " << feet
         << " and inches is " << inches << endl;
    return 0;
}
