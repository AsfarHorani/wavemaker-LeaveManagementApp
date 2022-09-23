/*Copyright (c) 2022-2023 venturedive.com All Rights Reserved.
 This software is the confidential and proprietary information of venturedive.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with venturedive.com*/
package com.leave_management_system.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.export.ExportOptions;

import com.leave_management_system.hrdb.models.query.*;

public interface HrdbQueryExecutorService {

    Page<CavationDaysResponse> executeCavation_days(Pageable pageable);

    void exportCavation_days(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

    Page<Vacationlist2Response> executeVacationlist2(Pageable pageable);

    void exportVacationlist2(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

    Page<TotalLeavesYetResponse> executeTotal_leaves_yet(Integer id, Pageable pageable);

    void exportTotal_leaves_yet(Integer id, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

    Integer executeLeaveAction(LeaveActionRequest leaveActionRequest);

    Page<TobeApprovvedLeavesResponse> executeTobeApprovvedLeaves(Pageable pageable);

    void exportTobeApprovvedLeaves(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

    Page<ChartDataByManagerIdResponse> executeChartDataByManagerId(Integer mangerId, Pageable pageable);

    void exportChartDataByManagerId(Integer mangerId, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

    ChartdataallResponse executeChartdataall();

}