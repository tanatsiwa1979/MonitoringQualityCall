/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.QualityCallMonitoring.repository;

import com.geneinsure.QualityCallMonitoring.entity.Calls;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author "Tana"
 */
public interface CallRepository extends JpaRepository<Calls, Long>{

    
}
