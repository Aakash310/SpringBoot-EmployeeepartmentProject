package com.project.paytm.department;

import javax.persistence.*;

@Entity
@Table(name = "dept_TBL")
public class Department {

    @Id
    private int deptId;
    private String deptName;
    private String deptHead;

    public Department() {
    }

    public Department(int deptId, String deptName, String deptHead) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptHead='" + deptHead + '\'' +
                '}';
    }
}
