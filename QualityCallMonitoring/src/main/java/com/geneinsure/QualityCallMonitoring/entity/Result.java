/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.QualityCallMonitoring.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author "Tana"
 */
@Entity
@Data
public class Result implements Serializable{
 @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false,name = "created_ts")
    private LocalDateTime createdTimeStamp;
    
    @Column(name = "updated_ts")
    private LocalDateTime updatedTimeStamp;
    
    @ManyToOne
    @JoinColumn(name = "call_id", referencedColumnName = "id")
    private Calls  call;
    
    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question  question;
   
    private int answer;
    
    private int score ;
    @Column(name = "max_possible")
    private int maxPossible;
    
    
}
