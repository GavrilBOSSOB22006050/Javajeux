public class Hero{ // il faut inventaire (extends Perso)
    private String name;
    private int latitude;//  latitude
    private int longitude;// longitude
    private int attaque;
    private int def;
    private int pv;
    private int velo;
    private int ex;
    /*private int inventaire;
    private int arme;
    private int potion;
    private int artefacts;*/

    public Hero(int latitude, int longitude, String name, int attaque, int def, int pv, int velo, int ex){
        //super(ex, attaque, def, pv, velo);
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        //this.inventaire = inventaire;
        //this.arme = arme;
        //this.potion = potion;
        //this.artefacts = artefacts;
    }

    public int getLongitude(){ // cordo x
        return longitude;
    }

    public void setLongitude(int longitude){
        this.longitude = longitude;
    }

    public int getLatitude (){ //cordo y
        return latitude;
    }

    public void setLatitude(int latitude){
        this.latitude = latitude;
    }

    public String getname(){ //nom 
        return name;
    }

    public void setname(String name){
        this.name = name;
    }
///faire des collision 

    /*public void collision(char X){
        if("haut" == X){

        } 
    }*/

    public void deplacer(String deplacement){ //déplacement + colision (penser a modif les getlongitude et latitude)
        //List<int> k = new ArrayList<int>();
        switch (deplacement){ 
            case "haut":
                setLatitude(latitude -=1);
                if (getLatitude() == 0 || getLatitude() == 4 && getLongitude() == 1 || getLatitude() == 3 && getLongitude() == 3 || getLatitude() == 3 && getLongitude() == 4 || getLatitude() == 6 && getLongitude() == 2 || getLatitude() == 6 && getLongitude() == 3 || getLatitude() == 6 && getLongitude() == 4 || getLatitude() == 3 && getLongitude() == 7 ) {
                    setLatitude(latitude += 1); 
                    System.out.println("Attention il y a un mur !");
                }
                break;
            case "bas":
                setLatitude(latitude += 1);
                if (getLatitude() == 9 || getLatitude() == 4 && getLongitude() == 1 || getLatitude() == 2 && getLongitude() == 3 || getLatitude() == 2 && getLongitude() == 4 || getLatitude() == 6 && getLongitude() == 2 || getLatitude() == 6 && getLongitude() == 3 || getLatitude() == 6 && getLongitude() == 4 || getLatitude() == 8 && getLongitude() == 3 || getLatitude() == 7 && getLongitude() == 7 || getLatitude() == 8 && getLongitude() == 8) {
                    setLatitude(latitude -= 1); 
                    System.out.println("Attention il y a un mur !");
                }
                break;
            case "droite":
                setLongitude(longitude += 1);
                if (getLongitude() == 9 || getLatitude() == 2 && getLongitude() == 3 || getLatitude() == 3 && getLongitude() == 3 || getLatitude() == 6 && getLongitude() == 2 || getLatitude() == 8 && getLongitude() == 3 || getLatitude() == 1 && getLongitude() == 7 || getLatitude() == 2 && getLongitude() == 7 || getLatitude() == 3 && getLongitude() == 7 || getLatitude() == 7 && getLongitude() == 7 || getLatitude() == 8 && getLongitude() == 7) {
                    setLongitude(longitude -= 1);
                    System.out.println("Attention il y a un mur !");
                }
                break;
            case "gauche":
                setLongitude(longitude -= 1);
                if (getLongitude() == 0 || getLatitude() == 4 && getLongitude() == 1 || getLatitude() == 2 && getLongitude() == 4 || getLatitude() == 3 && getLongitude() == 4 || getLatitude() == 6 && getLongitude() == 4 || getLatitude() == 8 && getLongitude() == 3 || getLatitude() == 1 && getLongitude() == 7 || getLatitude() == 2 && getLongitude() == 7 || getLatitude() == 3 && getLongitude() == 7 || getLatitude() == 7 && getLongitude() == 7) {
                    setLongitude(longitude += 1);
                    System.out.println("Attention il y a un mur !");
                }
                break;
        }
    }

}