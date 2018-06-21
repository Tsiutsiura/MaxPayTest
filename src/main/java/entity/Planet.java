package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Planet extends BaseEntity {
    private String name;
    @JsonProperty("rotation_period")
    private int rotationPeriod;
    @JsonProperty("orbital_period")
    private int orbitalPeriod;
    private int diameter;
    private String climate;
    private String gravity;
    private String terrain;
    @JsonProperty ("surface_water")
    private int surfaceWater;
    private int population;
    @JsonProperty ("residents")
    private List<String> residentUrls;
    @JsonProperty("films")
    private List<String> filmUrls;

    public  Planet(){ }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(int rotation_period) {
        this.rotationPeriod = rotation_period;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(int orbital_period) {
        this.orbitalPeriod = orbital_period;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public int getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(int surface_water) {
        this.surfaceWater = surface_water;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<String> getResidentUrls() {
        return residentUrls;
    }

    public void setResidentUrls(List<String> residentUrls) {
        this.residentUrls = residentUrls;
    }

    public List<String> getFilmUrls() {
        return filmUrls;
    }

    public void setFilmUrls(List<String> filmUrls) {
        this.filmUrls = filmUrls;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", rotationPeriod=" + rotationPeriod +
                ", orbitalPeriod=" + orbitalPeriod +
                ", diameter=" + diameter +
                ", climate='" + climate + '\'' +
                ", gravity='" + gravity + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surfaceWater=" + surfaceWater +
                ", population=" + population +
                ", residentUrls=" + residentUrls +
                ", filmUrls=" + filmUrls +
                '}';
    }
}
