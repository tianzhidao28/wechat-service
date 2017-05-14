package com.rocyuan.wechat.core.response;

import org.apache.commons.collections.CollectionUtils;
import org.apdplat.qa.SharedQuestionAnsweringSystem;
import org.apdplat.qa.model.CandidateAnswer;
import org.apdplat.qa.model.Question;

import java.util.Collections;
import java.util.List;

/**
 * Created by rocyuan on 2017/5/15.
 */
public class QuestionAnsweringSystemApi implements Answer{

    public String answer(String questionStr) {

        Question question = SharedQuestionAnsweringSystem.getInstance().answerQuestion(questionStr);
        if (question != null) {
            List<CandidateAnswer> candidateAnswers = question.getAllCandidateAnswer();

            if (CollectionUtils.isNotEmpty(candidateAnswers))
                return Collections.max(candidateAnswers).getAnswer();
        }
        return null;
    }
}
