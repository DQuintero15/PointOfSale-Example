package es.storehouse.models;

public class Provider {

    private int providerId;
    private String name;

    public Provider(int providerId, String name) {
        this.providerId = providerId;
        this.name = name;
    }

    public Provider() {
    }
    

    public Provider(String name) {
        this.name = name;
    }

    public Provider(int providerId) {
        this.providerId = providerId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
