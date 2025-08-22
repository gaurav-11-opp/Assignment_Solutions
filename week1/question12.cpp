#include <iostream>
using namespace std;
int main() {
    double feet;
    cout << "Enter the distance in feet: ";
    cin >> feet;
    double yards = feet / 3.0;        
    double miles = yards / 1760.0;    
    cout << "The distance is " << feet << " feet, which is " 
         << yards << " yards or " << miles << " miles." << endl;

    return 0;
}
