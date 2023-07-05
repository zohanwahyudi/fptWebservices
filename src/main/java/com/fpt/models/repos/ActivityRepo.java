package com.fpt.models.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fpt.models.entities.Activity;

public interface ActivityRepo extends CrudRepository <Activity, Long> {
  /*  @Query(value = "SELECT Id, Sun5Code, Sun5Desc, Block, GroupActivity, FFBActivity, Tumpukan, Status, CreatedBy, CreatedOn, ModifiedBy, ModifiedOn " +
                    "FROM teda.[ActivityMaster]" +
                    "WHERE Sun5Code LIKE CONCAT('%', :estate, '%') OR Sun5Desc LIKE CONCAT('%', :estate, '%') OR GroupActivity Like CONCAT('%', :group, '%')", nativeQuery = true)
    List<Activity> SelectActivityMasterTEDA(String estate, String group);        
*/
    @Query(value = "SELECT * " +
    "FROM teda.[ActivityMaster]" +
    "WHERE Sun5Code LIKE CONCAT('%', :estate, '%') OR Sun5Desc LIKE CONCAT('%', :estate, '%') OR GroupActivity Like CONCAT('%', :group, '%')", nativeQuery = true)
    List<Activity> SelectActivityMasterTEDA(String estate, String group);        

}
