/*Copyright (c) 2022-2023 venturedive.com All Rights Reserved.
 This software is the confidential and proprietary information of venturedive.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with venturedive.com*/
package com.leave_management_system.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ChartdataallResponse implements Serializable {


    @ColumnAlias("EMP_ID")
    private BigInteger empId;

    @ColumnAlias("FIRSTNAME")
    private String firstname;

    @ColumnAlias("LASTNAME")
    private String lastname;

    @ColumnAlias("MANAGER_ID")
    private BigInteger managerId;

    @ColumnAlias("TOTAL_VACATIONS")
    private BigInteger totalVacations;

    public BigInteger getEmpId() {
        return this.empId;
    }

    public void setEmpId(BigInteger empId) {
        this.empId = empId;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public BigInteger getManagerId() {
        return this.managerId;
    }

    public void setManagerId(BigInteger managerId) {
        this.managerId = managerId;
    }

    public BigInteger getTotalVacations() {
        return this.totalVacations;
    }

    public void setTotalVacations(BigInteger totalVacations) {
        this.totalVacations = totalVacations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChartdataallResponse)) return false;
        final ChartdataallResponse chartdataallResponse = (ChartdataallResponse) o;
        return Objects.equals(getEmpId(), chartdataallResponse.getEmpId()) &&
                Objects.equals(getFirstname(), chartdataallResponse.getFirstname()) &&
                Objects.equals(getLastname(), chartdataallResponse.getLastname()) &&
                Objects.equals(getManagerId(), chartdataallResponse.getManagerId()) &&
                Objects.equals(getTotalVacations(), chartdataallResponse.getTotalVacations());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(),
                getFirstname(),
                getLastname(),
                getManagerId(),
                getTotalVacations());
    }
}