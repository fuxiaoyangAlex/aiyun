package chapter_03_springAOP.com_itheima_cglib;

public class CglibTest {
//    测试类
    public static void main(String[] args){
//    创建代理对象
        CglibProxy cglibProxy = new CglibProxy();
//    创建目标对象
        UserDao userDao = new UserDao();
//        获取增强后的目标对象
        UserDao userDao1 =(UserDao)cglibProxy.createProxy(userDao);
//        执行方法
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
