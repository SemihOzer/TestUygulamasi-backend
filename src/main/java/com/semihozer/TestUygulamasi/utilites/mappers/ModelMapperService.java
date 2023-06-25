package com.semihozer.TestUygulamasi.utilites.mappers;

import org.modelmapper.ModelMapper;


public interface ModelMapperService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}
