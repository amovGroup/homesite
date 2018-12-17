package com.amov.homesite.service.impl;

import com.amov.homesite.mapper.InitializationConfigMapper;
import com.amov.homesite.model.InitializationConfig;
import com.amov.homesite.service.InitializationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitializationConfigServiceImpl implements InitializationConfigService {

    @Autowired
    private InitializationConfigMapper initializationConfigMapper;

    @Override
    public String getImage() {
        InitializationConfig config = new InitializationConfig();
        config.setKeyName("image_url");
        InitializationConfig res = initializationConfigMapper.queryInitializationConfigLimit1(config);
        return res.getValueName();
    }
}
