package dev.decagon.staff;

import dev.decagon.util.Gender;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class ManagerServiceImplTest {

    @Test
    @DisplayName("when Cashier role")
    public void TestHireCashier(){
        ManagerService managerService=new ManagerServiceImpl();
                assertSame(managerService.hire(new Staff(11,"Willy","willy@gmail.com",
                        Gender.FEMALE,Role.CASHIER, Qualification.BSC)),"Congratulations!!",
                        "should return Congratulations!!");
    }
    @Test
    @DisplayName("when not Cashier role")
    public  void testHireNotCashier(){
        ManagerService managerService=new ManagerServiceImpl();
        assertSame(managerService.hire(new Staff(11,"Willy","willy@gmail.com",
                Gender.FEMALE,Role.MANAGER, Qualification.BSC)),"Not eligible for this role",
                "Should return Not eligible for this role");
    }
    @Test
    @DisplayName("when not BSC qualification")
    public  void testHireNotBSC(){
        ManagerService managerService=new ManagerServiceImpl();
        assertSame(managerService.hire(new Staff(11,"Willy","willy@gmail.com",
                Gender.FEMALE,Role.MANAGER, Qualification.OND)),"Not eligible for this role",
                "Should return Not eligible for this role");
    }

}