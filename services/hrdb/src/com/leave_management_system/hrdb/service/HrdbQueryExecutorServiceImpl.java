/*Copyright (c) 2022-2023 venturedive.com All Rights Reserved.
 This software is the confidential and proprietary information of venturedive.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with venturedive.com*/
package com.leave_management_system.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.data.model.QueryProcedureInput;

import com.leave_management_system.hrdb.models.query.*;

@Service
public class HrdbQueryExecutorServiceImpl implements HrdbQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("hrdbWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "hrdbTransactionManager", readOnly = true)
    @Override
    public Page<CavationDaysResponse> executeCavation_days(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("cavation_days", params, CavationDaysResponse.class, pageable);
    }

    @Transactional(value = "hrdbTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportCavation_days(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput<CavationDaysResponse> queryInput = new QueryProcedureInput<>("cavation_days", params, CavationDaysResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "hrdbTransactionManager", readOnly = true)
    @Override
    public Page<Vacationlist2Response> executeVacationlist2(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("vacationlist2", params, Vacationlist2Response.class, pageable);
    }

    @Transactional(value = "hrdbTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportVacationlist2(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput<Vacationlist2Response> queryInput = new QueryProcedureInput<>("vacationlist2", params, Vacationlist2Response.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "hrdbTransactionManager", readOnly = true)
    @Override
    public Page<TotalLeavesYetResponse> executeTotal_leaves_yet(Integer id, Pageable pageable) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("id", id);

        return queryExecutor.executeNamedQuery("total_leaves_yet", params, TotalLeavesYetResponse.class, pageable);
    }

    @Transactional(value = "hrdbTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportTotal_leaves_yet(Integer id, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("id", id);

        QueryProcedureInput<TotalLeavesYetResponse> queryInput = new QueryProcedureInput<>("total_leaves_yet", params, TotalLeavesYetResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "hrdbTransactionManager")
    @Override
    public Integer executeLeaveAction(LeaveActionRequest leaveActionRequest) {
        Map<String, Object> params = new HashMap<>(2);

        params.put("status", leaveActionRequest.getStatus());
        params.put("id", leaveActionRequest.getId());

        return queryExecutor.executeNamedQueryForUpdate("LeaveAction", params);
    }

    @Transactional(value = "hrdbTransactionManager", readOnly = true)
    @Override
    public Page<TobeApprovvedLeavesResponse> executeTobeApprovvedLeaves(Pageable pageable) {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("tobeApprovvedLeaves", params, TobeApprovvedLeavesResponse.class, pageable);
    }

    @Transactional(value = "hrdbTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportTobeApprovvedLeaves(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(0);


        QueryProcedureInput<TobeApprovvedLeavesResponse> queryInput = new QueryProcedureInput<>("tobeApprovvedLeaves", params, TobeApprovvedLeavesResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "hrdbTransactionManager", readOnly = true)
    @Override
    public Page<ChartDataByManagerIdResponse> executeChartDataByManagerId(Integer mangerId, Pageable pageable) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("manger_id", mangerId);

        return queryExecutor.executeNamedQuery("chartDataByManagerId", params, ChartDataByManagerIdResponse.class, pageable);
    }

    @Transactional(value = "hrdbTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportChartDataByManagerId(Integer mangerId, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("manger_id", mangerId);

        QueryProcedureInput<ChartDataByManagerIdResponse> queryInput = new QueryProcedureInput<>("chartDataByManagerId", params, ChartDataByManagerIdResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "hrdbTransactionManager", readOnly = true)
    @Override
    public ChartdataallResponse executeChartdataall() {
        Map<String, Object> params = new HashMap<>(0);


        return queryExecutor.executeNamedQuery("chartdataall", params, ChartdataallResponse.class);
    }

}