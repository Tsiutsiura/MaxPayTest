package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Film  extends BaseEntity {
    private String title;

    @JsonProperty("episode_id")
    private int episodeId;
    @JsonProperty("opening_crawl")
    private String openingCrawl;

    private String director;
    private String producer;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("characters")
    private List<String> characterUrls;
    @JsonProperty("planets")
    private List<String> planetUrls;
    @JsonProperty("starships")
    private List<String> starshipUrls;
    @JsonProperty("species")
    private List<String> specieUrls;

    public  Film(){ }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getCharacterUrls() {
        return characterUrls;
    }

    public void setCharacterUrls(List<String> characterUrls) {
        this.characterUrls = characterUrls;
    }

    public List<String> getPlanetUrls() {
        return planetUrls;
    }

    public void setPlanetUrls(List<String> planetUrls) {
        this.planetUrls = planetUrls;
    }

    public List<String> getStarshipUrls() {
        return starshipUrls;
    }

    public void setStarshipUrls(List<String> starshipUrls) {
        this.starshipUrls = starshipUrls;
    }

    public List<String> getSpecieUrls() {
        return specieUrls;
    }

    public void setSpecieUrls(List<String> specieUrls) {
        this.specieUrls = specieUrls;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", episodeId=" + episodeId +
                ", openingCrawl='" + openingCrawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", characterUrls=" + characterUrls +
                ", planetUrls=" + planetUrls +
                ", starshipUrls=" + starshipUrls +
                ", specieUrls=" + specieUrls +
                '}';
    }
}
