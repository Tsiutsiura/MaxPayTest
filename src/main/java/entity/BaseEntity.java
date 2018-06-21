package entity;

public abstract class BaseEntity {
    private String created;
    private String edited;
    private String url;

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
        return "BaseEntity{" +
                "created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
