package homework29_02.overriding19;

class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS rate of Interest: "+a.getRateOfInterest());

    }
}
