package tests;

import org.testng.annotations.Test;
import pageObject.pages.SchedulePage;

public class ScheduleTest extends TestInit {

    @Test
    public void scheduleOpen() {
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openUp()
                .openSettings();
    }
//    @Test
//    public void glasses(){
//        SchedulePage sch = new SchedulePage(getDriver());
//        sch.openUp();
//        sch.scheduleOpen();
//        sch.glassesInfo();
//

    @Test
    public void glasses() {
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openUp();
        sch.scheduleOpen();
        sch.glassesInfo();

    }
}

