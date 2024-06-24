package in.mesagnik.creational.factory;

public class GetPlanFactory {

    public Plan getPlan(String planType){

        if(planType.isEmpty()) return null;

        if(planType.equals("DOMESTIC")) return new DomesticPlan();
        else if(planType.equals("COMMERCIAL")) return new CommercialPlan();
        else return new InstitutionalPlan();
    }
}
