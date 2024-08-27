package animals;

public class Orangutan {

        private int liczbaNog;

        private String kolor;

        public Orangutan() {
            this.liczbaNog = 4;
            this.kolor = "czarny";
        }

        public Orangutan( int liczbaNog, String kolor){
            this.liczbaNog = liczbaNog;
            this.kolor = kolor;
        }

        public void skacz () {
            String skokZKolorem = kolor + " - ja skaczę na " + liczbaNog + " nogach!";
            System.out.println(skokZKolorem);
    }
    public String getKolor() {
            return kolor;
    }
    public void setKolor(String kolor) {
            this.kolor = kolor;
    }
}
