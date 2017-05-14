package com.rocyuan.wechat.core;

import org.apdplat.qa.SharedQuestionAnsweringSystem;
import org.apdplat.qa.model.CandidateAnswer;
import org.apdplat.qa.model.Question;
import org.junit.Test;

import java.util.List;

/**
 * Created by rocyuan on 2017/5/15.
 */
public class QuestionAnsweringSystemTest {

    @Test
    public void testQuestionAnsweringSystem()
    {

        String questionStr = "APDPlat的作者是谁？";
        Question question = SharedQuestionAnsweringSystem.getInstance().answerQuestion(questionStr);
        if (question != null) {
            List<CandidateAnswer> candidateAnswers = question.getAllCandidateAnswer();
            int i=1;
            for(CandidateAnswer candidateAnswer : candidateAnswers){
                System.out.println((i++)+"、"+candidateAnswer.getAnswer()+":"+candidateAnswer.getScore());
            }
        }

    }
}
