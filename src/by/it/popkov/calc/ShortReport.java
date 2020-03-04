package by.it.popkov.calc;

class ShortReport implements Report {
    @Override
    public void writeHead() {
        System.out.println("Short Head");
    }

    @Override
    public void writeTimeStart() {
        System.out.println("Short TimeStart");
    }

    @Override
    public void writeTimeFinish() {
        System.out.println("Short TimeFinish");
    }

    @Override
    public void writeOperation() {
        System.out.println("Short Operation");
    }

    @Override
    public void writeErrors() {
        System.out.println("Short Errors");
    }
}
