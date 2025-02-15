package com.example.basic.Services;

import org.springframework.stereotype.Service;

import com.example.basic.Entities.Profile;
import com.example.basic.Repositories.BaseRepository;

@Service
public class ProfileServiceImpl extends BaseServiceImpl<Profile, Long> implements ProfileService {

    public ProfileServiceImpl(BaseRepository<Profile, Long> baseRepository) {
        super(baseRepository);
    }

}