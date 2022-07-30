package net.purocodigo.backendcursojava.shared.dto;

import java.io.Serializable;
import java.util.List;

public class ExposureDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private long id;

    private String type;

    private List<PostDto> posts;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<PostDto> getPosts() {
        return this.posts;
    }

    public void setPosts(List<PostDto> posts) {
        this.posts = posts;
    }

}
