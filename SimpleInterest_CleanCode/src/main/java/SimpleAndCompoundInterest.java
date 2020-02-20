public class SimpleAndCompoundInterest {
    private float principalAmount;
    private float term_of_loan_years;
    private float rate_of_interest;
    private float no_of_times_compounded;
    SimpleAndCompoundInterest(float principalAmt,float term_of_loan_yrs,float rateOfInterest,float n_compounded){
        principalAmount=principalAmt;
        term_of_loan_years=term_of_loan_yrs;
        rate_of_interest=rateOfInterest;
        no_of_times_compounded=n_compounded;
    }
    public float calculateSimpleInterest(){
        float sInterest;
        sInterest=(principalAmount*term_of_loan_years*rate_of_interest)/100;
        return (float) sInterest;
    }
    public float calculateCompoundInterest(){
        float cInterest;
        cInterest= (float) (principalAmount*(Math.pow(rate_of_interest/no_of_times_compounded,no_of_times_compounded*term_of_loan_years)));
        return (float) cInterest;
    }
}
