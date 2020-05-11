public class Person {
    private String name; //required
    private String job;
    private String university;
    private String drivingLicence;
    private boolean isMarried;

    public Person(PersonBuilder builder){
        this.name=builder.name;
        this.job=builder.job;
        this.university=builder.university;
        this.drivingLicence=builder.drivingLicence;
        this.isMarried=builder.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Artist: "+this.name+", "+this.job+", "+this.university+", "+this.drivingLicence+", "+this.isMarried;
    }
    public static class PersonBuilder{
        private String name; //required
        private String job;
        private String university;
        private String drivingLicence;
        private boolean isMarried;

        public PersonBuilder(String fullName){this.name=fullName;}

        public PersonBuilder setJob(String job){
            this.job=job;
            return this;
        }
        public PersonBuilder setUniversity(String university){
            this.university=university;
            return this;
        }
        public PersonBuilder setDrivingLicence(String drivingLicence){
            this.drivingLicence=drivingLicence;
            return this;
        }
        public PersonBuilder setisMarried(boolean isMarried){
            this.isMarried=isMarried;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}