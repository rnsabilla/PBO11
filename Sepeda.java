package abstrak;


public class Sepeda extends Kendaraan {
    
    public boolean isAuto;
    
    public void jalankan(){
        boolean isAuto = true;
        if (isAuto == true){
            System.out.println("Berjalan Sendiri");
        }
        else {
            System.out.println(" . ");
        }
    }

    public static void main (String args []){
        Sepeda sepedaku = new Sepeda();

        sepedaku.nyalakan();
    }

    @Override
    public void nyalakan() {
        // TODO Auto-generated method stub

    }
}