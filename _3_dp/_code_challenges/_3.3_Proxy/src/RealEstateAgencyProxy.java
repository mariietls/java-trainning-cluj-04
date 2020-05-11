import java.sql.SQLOutput;

public class RealEstateAgencyProxy implements RealEstateAgency {
    private RealEstateAgency realEstateAgency;
    public RealEstateAgencyProxy(){
        this.realEstateAgency=realEstateAgency;
    }

    @Override
    public Apartament rent(Student student, Apartament apartament) {
        if(student.name.trim().startsWith("P")){
            throw new RuntimeException("The agency doesn't rent to people whose name starts with P");
        }
        else {
            if(student.getMoney()>= apartament.getMonthyRentCost()){
                System.out.println("Apartament on "+apartament.getLocation()+" was rented to "+ student.name);
            }
            else {
                System.out.println("Apartment not rented");
            }
        }
        return apartament;
    }

    public void represent(Apartament apartament){
        System.out.println("The apartament on "+apartament.getLocation()+" is rented");
    }

}
