package org.server.SOLID.OpenClose;

import org.server.SOLID.SingleResponsibility.InputProcessor;
import org.server.SOLID.SingleResponsibility.Operation;
import org.server.SOLID.SingleResponsibility.Pair;
import org.server.SOLID.SingleResponsibility.Validator;

public class Main {
    public static void main(String[] args) {
        InterviewQuestionProcessor.process(new CSInterviewQuestions());
    }
}