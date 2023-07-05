package model;

public class Location {
    private String street, city;
    private int no, zip;

    public Location(){}

    public Location(String street, int no, int zip, String city) {
        this.street = street;
        this.city = city;
        this.no = no;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void newInputDialogue() {
        System.out.print("street: ");
        street = System.console().readLine();
        System.out.print("no.: ");
        no = Integer.parseInt(System.console().readLine());
        System.out.print("zip: ");
        zip = Integer.parseInt(System.console().readLine());    
        System.out.print("city: ");
        city = System.console().readLine();  
    }

    public static void newInputDialogue(Location loc) {
        System.out.print("street: ");
        loc.street = System.console().readLine();
        System.out.print("no.: ");
        loc.no = Integer.parseInt(System.console().readLine());
        System.out.print("zip: ");
        loc.zip = Integer.parseInt(System.console().readLine());    
        System.out.print("city: ");
        loc.city = System.console().readLine(); 
    }


    // Überladen
    public boolean equals(Location loc) {
        if (this == loc)
            return true;
        if (loc == null)
            return false;
        
        if (street == null) {
            if (loc.street != null)
                return false;
        } else if (!street.equals(loc.street))
            return false;
        if (city == null) {
            if (loc.city != null)
                return false;
        } else if (!city.equals(loc.city))
            return false;
        if (no != loc.no)
            return false;
        if (zip != loc.zip)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Location [street=" + street + ", city=" + city + ", no=" + no + ", zip=" + zip + "]";
    }

    

    
    
}
