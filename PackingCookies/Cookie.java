package PackingCookies;

public class Cookie {
    private String name;
    private boolean chocolateCrackers;
    
    public Cookie(String name, boolean chocolateCrackers) {
        this.name = name;
        this.chocolateCrackers = chocolateCrackers;
    }

    public String getName() { return this.name; }
    public boolean getChocolateCrackers() { return this.chocolateCrackers; }
}