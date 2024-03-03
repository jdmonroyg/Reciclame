package com.s1316tjavanext.reciclamebackend.controller;

import com.s1316tjavanext.reciclamebackend.dto.ProfileResponseDto;
import com.s1316tjavanext.reciclamebackend.dto.UserProfileRequestDto;
import com.s1316tjavanext.reciclamebackend.service.ProfileService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@Tag(name = "Profile", description = "Endpoints for managing profiles")
@RequestMapping("/profiles")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/{profileId}")
    public ResponseEntity<ProfileResponseDto> getProfile(@PathVariable UUID profileId) {
        return profileService.getProfile(profileId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/all")
    public ResponseEntity<List<ProfileResponseDto>> getProfiles(){
        return ResponseEntity.ok(profileService.getProfiles());

    }

    @PutMapping("/update/{profileId}")
    public ResponseEntity<ProfileResponseDto> updateProfile(@PathVariable UUID profileId,
                                                            @RequestParam("image") MultipartFile mpf,
                                                             UserProfileRequestDto userProfileRequestDto
                                                            ) {

        try {
            return ResponseEntity.ok(profileService.updateProfile(profileId, userProfileRequestDto, mpf));
        }catch (RuntimeException ignore){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/complete-profile/{profileId}")
    public ResponseEntity<ProfileResponseDto> completeProfile(@PathVariable UUID profileId,
                                             @RequestParam("image") MultipartFile mpf,
                                             @RequestParam("categories") List<String> categories) {
        try {
            return ResponseEntity.ok(profileService.completeProfile(profileId, mpf, categories));
        }catch (RuntimeException ignore){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{profileId}")
    public ResponseEntity<Void> deleteProfile(@PathVariable UUID profileId) {
        try {
            profileService.deleteProfile(profileId);
            return ResponseEntity.noContent().build();
        }catch (RuntimeException ignore){
            return ResponseEntity.notFound().build();
        }
    }
}