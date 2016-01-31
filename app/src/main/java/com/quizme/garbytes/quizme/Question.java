package com.quizme.garbytes.quizme;

/**
 * Created by Owner on 1/30/2016.
 */
public class Question {
    public int questionId;
    private int answer_A; // 1
    private int answer_B; // 2
    private int answer_C; // 3
    private int answer_D; // 4
    private int true_answer;

    public Question(int question, int A, int B, int C, int D, int answer) {
        this.questionId = question;
        this.answer_A = A;
        this.answer_B = B;
        this.answer_C = C;
        this.answer_D = D;
        this.true_answer= answer;
    }

    public int getAnswer() {
        return true_answer;
    }

    public int getQuestion() {
        return questionId;
    }

    public int getAnswer_A() { return answer_A;
    }

    public int getAnswer_C() {
        return answer_C;
    }

    public void setAnswer_C(int answer_C) {
        this.answer_C = answer_C;
    }

    public int getAnswer_B() {
        return answer_B;
    }

    public void setAnswer_B(int answer_B) {
        this.answer_B = answer_B;
    }

    public int getAnswer_D() {
        return answer_D;
    }

    public void setAnswer_D(int answer_D) {
        this.answer_D = answer_D;
    }

    public void setQuestion(int question) {
        this.questionId = question;
    }

    public int getTrue_answer() {
        return true_answer;
    }

    public void setTrue_answer(int true_answer) {
        this.true_answer = true_answer;
    }
}
