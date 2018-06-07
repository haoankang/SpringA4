package ank.hao.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PeopleService {

    @WebMethod
    void say();

    @WebMethod
    String study();
}
