package com.s1316tjavanext.reciclamebackend.dto;

import com.s1316tjavanext.reciclamebackend.entity.enums.Category;
import com.s1316tjavanext.reciclamebackend.entity.enums.Status;



import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * @author jdmon on 20/02/2024
 * @project reciclame-backend
 */
public record PostDto(
        UUID id,
        String title,
        String description,
        String imageUrl,
        Integer love,
        Category category,
        //Profile
        LocalDate date,
        Status status,
        List<CommentDto> comments) {
}