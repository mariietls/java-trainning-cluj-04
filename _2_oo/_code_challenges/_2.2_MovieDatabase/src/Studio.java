public class Studio {
    private String nume;
    private Film[] filme;

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;}

    public int nrOfMovies(){
        return this.filme.length;
    }

    public boolean isActorPlaying(String numeActor){
        for(int i=0;i<filme.length;i++){
            for(int j=0; j< filme[i].getActori().length;j++){
                if(filme[i].actorul(j).getNume()==numeActor)
                    return true;
            }
        }
        return false;
    }
    public Film filmul(int i){
        return filme[i];
    }
}