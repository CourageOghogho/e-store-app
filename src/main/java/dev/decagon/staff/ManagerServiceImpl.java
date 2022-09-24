package dev.decagon.staff;

public class ManagerServiceImpl implements ManagerService {

    public String hire(Staff applicant) {
        if(applicant.getRole()==Role.CASHIER && applicant.getQualification()==Qualification.BSC){
            return "Congratulations!!";
        }
        return "Not eligible for this role";
    }

}
