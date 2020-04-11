package edu.harvard.cs50.pokedex;

public class Pokemon {
    private String name;
    private String url;
    private boolean mIsCaught;


    Pokemon(String name, String url) {
        this.name = name;
        this.url = url;
        mIsCaught = false;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
    public void setCaught(boolean isCought){
        mIsCaught = isCought;
    }
    public boolean getCaught(){
        return mIsCaught;
    }

}
