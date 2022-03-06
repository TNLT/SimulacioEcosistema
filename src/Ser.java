public class Ser {
    // From: TNLN

    private double VidaAct;
    private double VidaTotal;
    private int CiclesVida;
    private int CicleCreation;


    public boolean isAlive(){
        return  VidaAct > 0;
    }

    public void ActualitzarLifeTime(int cicleActual){
        CiclesVida = cicleActual - CicleCreation;
    }


}
