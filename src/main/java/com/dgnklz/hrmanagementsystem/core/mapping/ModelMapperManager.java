package com.dgnklz.hrmanagementsystem.core.mapping;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModelMapperManager implements ModelMapperService{
    private ModelMapper mapper;
    @Override
    public ModelMapper forRequest() {
        mapper.getConfiguration().setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);
        return mapper;
    }

    @Override
    public ModelMapper forResponse() {
        mapper.getConfiguration().setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return mapper;
    }
}
