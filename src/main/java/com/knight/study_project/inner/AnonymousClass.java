package com.knight.study_project.inner;

/**
 * @Author: knight
 * @Date: 2018/10/23 下午4:07
 */
class TestEntity{
    private String name;
    private String id;

    public TestEntity() {
    }

    public TestEntity(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

public class AnonymousClass {
    //z实际上是final的，
    //当匿名内部类使用在外部定义的对象时，编译器会要求其参数是final的
    private TestEntity getEntity(String x,String y,String z){
        return new TestEntity(x,y){
            {
                System.out.println("构造器");
                if(z.equals("3")){
                    System.out.println("这是构造器处理");
                }
            }
            private String pd;{
                pd = z;
            }

            @Override
            public String toString() {
                return super.toString() + " + $classname{" +
                        "pd='" + pd + '\'' +
                        '}';
            }
        };
    }

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass();
        System.out.println(anonymousClass.getEntity("1","2","3"));
    }
}
