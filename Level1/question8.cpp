#include <iostream>
using namespace std;
int main() {
    double km;
    cout << "Enter distance in kilometers: ";
    cin >> km;
    double miles = km / 1.6;
    cout << "The total miles is " << miles << " mile for the given " << km << " km" << endl;
    return 0;
}
