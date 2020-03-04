package by.it.popkov.calc;

class LongReport implements Report{
    @Override
    public void writeHead() {
        System.out.println("Long Head");
    }

    @Override
    public void writeTimeStart() {
        System.out.println("Long TimeStart");
    }

    @Override
    public void writeTimeFinish() {
        System.out.println("Long TimeFinish");
    }

    @Override
    public void writeOperation() {
        System.out.println("Long Operation");
    }

    @Override
    public void writeErrors() {
        System.out.println("Long Errors");
    }
}
