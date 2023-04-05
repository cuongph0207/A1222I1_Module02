package module2.baitap.ss4_lop_va_doi_tuong_trong_java.stop_watch;

import java.util.Date;

public class Watch {
    private long startTime;
    private long endTime;



    public Watch() {
        this.startTime = new Date().getTime();
    }
    public void start(){
        this.startTime = new Date().getTime();
    }
    public void stop(){
        this.endTime = new Date().getTime();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
