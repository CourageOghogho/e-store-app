package dev.decagon.staff;

import dev.decagon.Users;
import dev.decagon.util.Gender;

public class Staff extends Users {
    private Role role;
    private Qualification qualification;


    public Staff(int id, String name, String email, Gender gender, Role role, Qualification qualification) {
        super(id, name, email, gender);
        this.role = role;
        this.qualification = qualification;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }
}
