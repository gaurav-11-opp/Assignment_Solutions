#include <iostream>
using namespace std;
int main() {
    double fee, discountPercent;
    cout << "Enter the course fee (INR): ";
    cin >> fee;
    cout << "Enter the discount percentage: ";
    cin >> discountPercent;
    double discount = (fee * discountPercent) / 100; 
    double finalFee = fee - discount;      
    cout << "The discount amount is INR " << discount
         << " and final discounted fee is INR " << finalFee << endl;

    return 0;
}
