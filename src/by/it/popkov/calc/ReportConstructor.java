package by.it.popkov.calc;

import java.time.LocalDateTime;

class ReportConstructor {
    private Report report;
    void setReportType(String type){
        if (type.equalsIgnoreCase("short")) report = new ReportShort();
        else if (type.equalsIgnoreCase("long")) report = new ReportLong();
    }
    void writeReport(LocalDateTime startTime, LocalDateTime finishTime, String logOperation, String logError){
        report.writeHead();
        report.writeTimeStart(startTime);
        report.writeTimeFinish(finishTime);
        report.writeOperation(logOperation);
        report.writeErrors(logError);
    }
}
