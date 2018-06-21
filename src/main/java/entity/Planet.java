package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Planet extends BaseEntity {
    protected String name;
    @JsonProperty("rotation_period")
    protected int rotationPeriod;
    @JsonProperty("orbital_period")
    protected int orbitalPeriod;
    protected int diameter;
    protected String climate;
    protected String gravity;
    protected String terrain;
    @JsonProperty ("surface_water")
    protected int surfaceWater;
    protected int population;
    protected List<String> residents;
    protected List<String> films;
    protected String created;
    protected String edited;
    protected String url;

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

    public List<String> getResidents() {
        return residents;
    }

    public void setResidents(List<String> residents) {
        this.residents = residents;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\n' +
                ", \n rotation_period=" + rotationPeriod +
                ", \n orbital_period=" + orbitalPeriod +
                ", \n diameter=" + diameter +
                ", \n climate='" + climate +
                ", \n gravity='" + gravity +
                ", \n terrain='" + terrain +
                ", \n surface_water=" + surfaceWater +
                ", \n population=" + population +
                ", \n residents=" + residents +
                ", \n films=" + films +
                ", \n created='" + created +
                ", \n edited='" + edited +
                ", \n url='" + url +
                '}';
    }
}
