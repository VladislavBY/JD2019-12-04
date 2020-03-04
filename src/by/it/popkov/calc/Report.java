package by.it.popkov.calc;

interface Report {
    void writeHead();
    void writeTimeStart();
    void writeTimeFinish();
    void writeOperation();
    void writeErrors();
}
