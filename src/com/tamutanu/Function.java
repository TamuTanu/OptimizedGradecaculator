package com.tamutanu;

class Function {

    private Double ALL_GRADE_SCORE;
    private Double ALL_CREDIT;
    private Double[] CREDIT = new Double[8];
    private Double GPA;

    public Function(){

    }

    public Function(Double ALL_GRADE_SCORE,Double ALL_CREDIT){
        this.ALL_GRADE_SCORE = ALL_GRADE_SCORE;
        this.ALL_CREDIT = ALL_CREDIT;
    }

    public void SET_CREDIT(Double...CREDIT){
        for(int i = 0; i < CREDIT.length; i++){
            this.CREDIT[i] = CREDIT[i];
        }
    }

    public void SET_ALL_CREDIT(){//คิดหน่วนกิตรวม
        Double SUM_ALL_CREDIT =0.0;
        for(int i=0; i<CREDIT.length;i++){
            SUM_ALL_CREDIT = SUM_ALL_CREDIT + CREDIT[i];
        }
        System.out.println("หน่วยกิตรวมคือ="+SUM_ALL_CREDIT);
        this.ALL_CREDIT = SUM_ALL_CREDIT;
    }

    public void SET_ALL_GRADE_SCORE(Double ALL_GRADE_SCORE){//คะแนนเกรดเฉลี่ย
        this.ALL_GRADE_SCORE = ALL_GRADE_SCORE;
    }

    public void SET_ALL_GRADE_SCORE(Double...ALL_GRADE_SCORE){//คิดคะแนนเกรดเฉลี่ย
        Double SUM_ALL_GRADE =0.0;
        Double[] CREDIT_MULTIPLY_GRADE= new Double[8];
        for(int i=0; i<ALL_GRADE_SCORE.length;i++){
            for(int j=0; j<CREDIT.length;j++){
                CREDIT_MULTIPLY_GRADE[j] = CREDIT[j] * ALL_GRADE_SCORE[i];
            }
        }
        for(int i=0; i<CREDIT_MULTIPLY_GRADE.length;i++){
            SUM_ALL_GRADE = SUM_ALL_GRADE + CREDIT_MULTIPLY_GRADE[i];
        }
        System.out.println("คะแนนเกรดเฉลี่ยคือ="+SUM_ALL_GRADE);
        this.ALL_GRADE_SCORE = SUM_ALL_GRADE;
    }

    public void GPA(Double ALL_GRADE_SCORE,Double ALL_CREDIT){
        Double GPA =ALL_GRADE_SCORE/ALL_CREDIT;
        this.GPA = GPA;
        System.out.println("GPA="+GPA);
    }

    public void GPA(){
        Double GPA =ALL_GRADE_SCORE/ALL_CREDIT;
        this.GPA = GPA;
        System.out.println("GPA="+GPA);
    }

}
