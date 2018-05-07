package com.springboot.oauth2.service.impl;

import com.springboot.oauth2.dao.ResourceMapper;
import com.springboot.oauth2.entity.Resource;
import com.springboot.oauth2.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ResourceService implements IResourceService {
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public Set<Resource> findUserResourcesByUserId(long userId) {
        return resourceMapper.findByUserId(userId);
    }

    @Override
    public Set<Resource> findAll() {
        return resourceMapper.findAll();
    }
}