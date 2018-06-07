package ank.hao.hessian.service;

import org.springframework.stereotype.Component;

@Component
public class PeopleServiceImpl implements PeopleService {
    @Override
    public void say() {
        System.out.println("Lily say..");
    }

    @Override
    public String study() {
        return "good";
    }
}
