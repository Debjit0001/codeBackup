#include <iostream>
#include <fstream>
using namespace std;

int main() {
    string inputFileName, outputFileName;

    cout << "\nEnter the input file location: ";
    cin >> inputFileName;

    ifstream inputFile(inputFileName);

    if (inputFile.is_open()) {
        cout << "\nEnter the output file location: ";
        cin >> outputFileName;

        ofstream outputFile(outputFileName);

        if(outputFile.is_open()) {
        char c;
        while (inputFile.get(c)) {
            if (!isspace(c) || c == '\n') {
                outputFile << c;
            }
        }

        inputFile.close();
        outputFile.close();

        cout << "File copied successfully!" << endl;
        }
        else
            cout << "Unable to open output file " << outputFileName << "." << endl;
    }
    
    else 
        cout << "Unable to open input file " << inputFileName << "." << endl;

    return 0;
}
