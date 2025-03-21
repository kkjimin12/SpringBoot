package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {

	@Id //기본 키 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) //해당 속성값을 1씩 증가
	private Integer id;
	
	@Column(length = 200)// 해당 컬럼 길이를 200으로 지정
	private String subject;
	
	@Column(columnDefinition = "TEXT") //해당 컬럼 텍스트를 지정할 수 있음 (문자열)
	private String content;
	
	private LocalDateTime createDate;
	
	//@ManyToOne // N:1
    //private Question question;
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
	
	@ManyToOne
	private SiteUser author;
	
	private LocalDateTime modifyDate;
	
	@ManyToMany
	Set<SiteUser> voter;
}
