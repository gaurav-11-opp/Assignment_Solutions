#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double radiusKm = 6378.0;  
    double pi = 3.141592653589793;
    double volumeKm3 = (4.0 / 3.0) * pi * pow(radiusKm, 3);
    double radiusMiles = radiusKm * 0.621371;
    double volumeMiles3 = (4.0 / 3.0) * pi * pow(radiusMiles, 3);

    cout << "The volume of earth in cubic kilometers is " << volumeKm3
         << " and cubic miles is " << volumeMiles3 << endl;

    return 0;
}
