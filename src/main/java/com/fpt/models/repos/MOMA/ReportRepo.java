package com.fpt.models.repos.MOMA;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// import com.fpt.models.entities.MOMA.Boiler;
import com.fpt.models.entities.MOMA.Report;

public interface ReportRepo extends CrudRepository <Report, Long> {
    @Query(value = "EXEC dbo.BoilerDataReport :transactiondate, :millcode, :machinemastercode ", nativeQuery = true)
    List<Report[]> DataReportBoiler(@Param("transactiondate") String transactiondate, @Param("millcode") String millcode, @Param("machinemastercode") String machinemastercode);


}
