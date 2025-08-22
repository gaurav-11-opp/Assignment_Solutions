#include <iostream>
using namespace std;

int main() {
    double fee = 125000;
    double discountPercent = 10;

    double discount = (fee * discountPercent) / 100;   
    double finalFee = fee - discount;                  

    cout << "The discount amount is INR " << discount 
         << " and final discounted fee is INR " << finalFee << endl;

    return 0;
}
