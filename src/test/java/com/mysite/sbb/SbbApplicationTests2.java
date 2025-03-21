package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

//import jakarta.transaction.Transactional;

@SpringBootTest
class SbbApplicationTests2 {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerReopository;
	
	@Transactional

	@Test
	void contextLoads() {
		//데이터 insert
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);//question 테이블 첫번째 행에 들어갈 데이터
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링 부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
		//값 비교
//		List<Question> all = this.questionRepository.findAll(); //데이터 전체 조회
//		assertEquals(2, all.size()); //(기댓값, 실제값) / all.size() => 현재 데이터 수
//		
//		Question q = all.get(0); //리스트 0 부터 시작
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
		//해당 question repository를 가져오기
//		Optional<Question> oq = this.questionRepository.findById(1); //id가 1인 값을 가져옴 / optional => 리턴타입
//		if(oq.isPresent()) { // oq 값 존재 유무
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
		
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());
		
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//		assertEquals(1, q.getId());
		//SQL 연산자 : and, or, between, lessthan, greaterthanequals, like, in, orderby
		
		//findBySubjectLike() 있는 Like 가지고 테스트
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
		//데이터 수정
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);
		
		//데이터 삭제
//		assertEquals(2,this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q); //삭제
//		assertEquals(1, this.questionRepository.count()); // 건수가 1이 되었는지 확인

		//Answer 테이블
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
		//answer 테이블에 데이터 넣기
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerReopository.save(a);
		
		//답변 데이터 조회, 확인 (Answer , Question 데이터 조인 left join)
		/*
		Optional<Answer> oa = this.answerReopository.findById(1);
		assertTrue(oa.isPresent());
		Answer a = oa.get();
		assertEquals(2, a.getQuestion().getId());
		*/
		
		//질문 데이터 조회 후 이 질문에 달린 답변 전체를 구하는 테스트 코드
		//에러 -> question 객체를 조회한 후 DB 세션 끊어짐, 테스트 코드에서만 오류 발생
		// @Transactional 어노테이션 이용해서 DB 세션 유지
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		List<Answer> answerList = q.getAnswerList();
		
		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}

}
