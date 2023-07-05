package com.fpt.controller.MOMA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.models.entities.MOMA.Report;
import com.fpt.services.MOMA.ReportService;

@RestController
@RequestMapping("api/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/BoilerDataReport")
    public List<Report[]> DataReportBoiler(@RequestParam("transactiondate")String transactiondate, @RequestParam("millcode") String millcode, @RequestParam("machinemastercode") String machinemastercode ){
        return reportService.DataReportBoiler(transactiondate, millcode, machinemastercode);
    }
    
}
