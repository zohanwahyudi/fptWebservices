package com.fpt.services.MOMA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.models.entities.MOMA.Report;
import com.fpt.models.repos.MOMA.ReportRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReportService {
    @Autowired
    private ReportRepo reportRepo;

    public List<Report[]> DataReportBoiler(String transactiondate, String millcode, String machinemastercode){
        return reportRepo.DataReportBoiler(transactiondate, millcode, machinemastercode);
    }
}
