package net.purocodigo.backendcursojava.services;

import java.util.List;

import net.purocodigo.backendcursojava.shared.dto.PostCreationDto;
import net.purocodigo.backendcursojava.shared.dto.PostDto;

public interface PostServiceInterface {
    public PostDto createPost(PostCreationDto post);

    public List<PostDto> getLastPosts();

    public PostDto getPost(String postId);

    public void deletePost(String postId, long userId);

    public PostDto updatePost(String postId, long userId, PostCreationDto postUpdateDto);
}
