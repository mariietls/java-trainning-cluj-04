public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori){
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }
    public Actor actorul(int i){
        return actori[i];
    }
    public boolean actorAbove50Playing(){
        boolean play=false;
        int i=0;
        while(i<actori.length && play==false)
        {
            if(actorul(i).getVarsta()>50){
                play=true;
                i++;
            }
        }
        if(play==true)
            return true;
        else
            return false;
    }
}