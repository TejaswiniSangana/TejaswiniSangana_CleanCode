public class HouseConstruction {
    private int materialStandard;
    private float total_area_of_house;
    private String fully_automated;

    HouseConstruction(int m_standard,float area){
        materialStandard=m_standard;
        total_area_of_house=area;
        //fully_automated=automated;
    }
    float calculateHouseConstructionCost(){
        float construction_cost = 0;
        float cost_per_square_feet;
        if(materialStandard == 1){
            cost_per_square_feet= (float) 1200.0;
            construction_cost=cost_per_square_feet*total_area_of_house;
        }
        else if(materialStandard== 2){
            cost_per_square_feet= (float) 1500.0;
            construction_cost=cost_per_square_feet*total_area_of_house;
        }
        else if(materialStandard==3) {
            cost_per_square_feet = (float) 1800.0;
            construction_cost = cost_per_square_feet * total_area_of_house;
        }
        else if(materialStandard==4){
            cost_per_square_feet = (float) 2500.0;
            construction_cost = cost_per_square_feet * total_area_of_house;
        }
        return (float)construction_cost;
    }
}
