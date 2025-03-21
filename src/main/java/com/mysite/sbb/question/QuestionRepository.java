package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page; //페이징을 위한 클래스
import org.springframework.data.domain.Pageable; //페이징을 처리하는 인터페이스
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

	/*
	 * JpaRepository<Question, Integer> => question 엔티티로 리포지터리를 생성 / question 엔티티의 기본키가 integer
	 * */
	
	Question findBySubject(String subject); //신규 생성
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);
	Page<Question> findAll(Pageable pageable); //페이징 처리
	Page<Question> findAll(Specification<Question> spec, Pageable pageable);
}
