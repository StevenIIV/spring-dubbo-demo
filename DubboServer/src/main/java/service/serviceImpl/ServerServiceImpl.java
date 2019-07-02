package service.serviceImpl;

import service.ServerService;

public class ServerServiceImpl implements ServerService {
    @Override
    public void test() {
        System.out.println("this is dubbo!");
    }
}
