package cn.sartner.demo;

/**
 * Created by huangxin on 2015/6/19.
 */
public class HeyGuys extends BaseHello {

    @Override
    public String hello(String name) {
        return "hey, "+ name;
    }
}
