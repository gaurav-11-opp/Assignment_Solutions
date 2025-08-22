#include <iostream>
using namespace std;

int main() {
    double feet;
    cout << "Enter distance in feet: ";
    cin >> feet;

    double yards = feet / 3;
    double miles = yards / 1760;

    cout << "The distance in yards is " << yards
         << " while the distance in miles is " << miles << endl;

    return 0;
}
