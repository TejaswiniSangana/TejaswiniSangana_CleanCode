import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        float principalAmount,rate_of_interest,term_of_loan_years,no_of_times_compounded;
        float simpleInterest,compoundInterest;
        float total_area_of_house,houseConstructionCost;
        int materialStandard;
        String fully_automated;
        System.out.println("Simple And Compound Interest Calculation");
        System.out.println("Principal Amount:");
        principalAmount=scanner.nextFloat();
        System.out.println("Rate of Interest:");
        rate_of_interest=scanner.nextFloat();
        System.out.println("Term of loan in years:");
        term_of_loan_years=scanner.nextFloat();
        System.out.println("Number of times that interest is compounded:");
        no_of_times_compounded=scanner.nextFloat();
        SimpleAndCompoundInterest simpleAndCompoundInterest=new SimpleAndCompoundInterest(principalAmount,term_of_loan_years,rate_of_interest,no_of_times_compounded);
        simpleInterest=simpleAndCompoundInterest.calculateSimpleInterest();
        compoundInterest=simpleAndCompoundInterest.calculateCompoundInterest();
        System.out.println("Simple Interest : Rs."+simpleInterest);
        System.out.println("Compound Interest : Rs."+compoundInterest);
        System.out.println("House Construction Cost Calculation");
        System.out.println("Materials to be used for House construction:");
        System.out.println("1.Standard Materials\n2.Above Standard Materials\n3.High Standard Materials\n4.High Standard Materials and Fully Automated Home");
        materialStandard=scanner.nextInt();
        System.out.println("Total Area of the House:");
        total_area_of_house=scanner.nextFloat();
        HouseConstruction houseConstruction=new HouseConstruction(materialStandard,total_area_of_house);
        houseConstructionCost=houseConstruction.calculateHouseConstructionCost();
        System.out.println("Construction cost of House : Rs."+houseConstructionCost);
    }
}
