package by.it.popkov.calc;

class ReportConstructor {
    private Report report;
    void setReportType(String type){
        if (type.equalsIgnoreCase("short")) report = new ShortReport();
        else if (type.equalsIgnoreCase("long")) report = new LongReport();
    }
    void writeReport(){
        report.writeHead();
        report.writeTimeStart();
        report.writeOperation();
        report.writeErrors();
        report.writeTimeFinish();
    }
}
