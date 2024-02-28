package com.s1316tjavanext.reciclamebackend.mapper;

import com.s1316tjavanext.reciclamebackend.dto.PostDto;
import com.s1316tjavanext.reciclamebackend.dto.PostRequestDto;
import com.s1316tjavanext.reciclamebackend.entity.Post;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

/**
 * @author jdmon on 21/02/2024
 * @project reciclame-backend
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PostMapper {
    PostDto postToPostDto(Post post);
    List<PostDto> postsToPostsDto(List<Post> posts);
    PostDto postRequestDtoToPostDto(PostRequestDto postRequestDto);
    @InheritInverseConfiguration
    @Mapping(target = "comments", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    Post postDtoToPost(PostDto postDto);
}