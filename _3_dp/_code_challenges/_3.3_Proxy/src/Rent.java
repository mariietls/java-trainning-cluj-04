public class Rent {
    public static void main(String[] args){
        Apartament app01= new Apartament("Crangasi01", 300);
        Apartament app02= new Apartament("Crangasi01", 600);
        Apartament app03= new Apartament("Crangasi01", 350);
        Apartament app04= new Apartament("Crangasi01", 400);
        Apartament app05= new Apartament("Crangasi01", 200);

        Student student= new Student("Ionescu", 500);
        Student student1= new Student("Popescu", 330);

        RealEstateAgencyProxy realEstateAgencyProxy= new RealEstateAgencyProxy();
        realEstateAgencyProxy.represent(app01);
        realEstateAgencyProxy.represent(app02);
        realEstateAgencyProxy.represent(app03);
        realEstateAgencyProxy.represent(app04);
        realEstateAgencyProxy.represent(app05);

        Apartament apartament1=realEstateAgencyProxy.rent(student, app01);
        Apartament apartament2=realEstateAgencyProxy.rent(student1, app02);
    }
}
