package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class People extends BaseEntity {
    private String name;
    private int height;
    private int mass;
    @JsonProperty("hair_color")
    private String hairСolor;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("birth_year")
    private String birthYear;
    private String gender;
    private String homeworld;
    @JsonProperty("filmUrls")
    private List<String> filmUrls;
    @JsonProperty("specieUrls")
    private List<String> specieUrls;
    @JsonProperty("vehicle")
    private List<String> vehicleUrls;
    @JsonProperty("starship")
    private List<String> starshipUrls;

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }


    public String getHairСolor() {
        return hairСolor;
    }

    public void setHairСolor(String hairСolor) {
        this.hairСolor = hairСolor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }


    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public List<String> getFilmUrls() {
        return filmUrls;
    }

    public void setFilmUrls(List<String> filmUrls) {
        this.filmUrls = filmUrls;
    }

    public List<String> getSpecieUrls() {
        return specieUrls;
    }

    public void setSpecieUrls(List<String> specieUrls) {
        this.specieUrls = specieUrls;
    }

    public List<String> getVehicleUrls() {
        return vehicleUrls;
    }

    public void setVehicleUrls(List<String> vehicleUrls) {
        this.vehicleUrls = vehicleUrls;
    }

    public List<String> getStarshipUrls() {
        return starshipUrls;
    }

    public void setStarshipUrls(List<String> starshipUrls) {
        this.starshipUrls = starshipUrls;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", mass=" + mass +
                ", hairСolor='" + hairСolor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", filmUrls=" + filmUrls +
                ", specieUrls=" + specieUrls +
                ", vehicleUrls=" + vehicleUrls +
                ", starshipUrls=" + starshipUrls +
                '}';
    }
}

