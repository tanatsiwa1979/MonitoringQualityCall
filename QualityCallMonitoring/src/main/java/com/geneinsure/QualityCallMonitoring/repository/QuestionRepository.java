/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.QualityCallMonitoring.repository;


import com.geneinsure.QualityCallMonitoring.entity.Question;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author "Tana"
 */
public interface QuestionRepository extends JpaRepository<Question, Long>{

    public List<Question> findAllByOrderByQuestionNumberAsc();  
}
