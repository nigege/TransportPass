package com.tsp.transportpass.entity;




public class UsersEntity {
    private long id;
    private String name;
    private int age;
    private String sex;
    private String phone;
    private String city;
    //getter：注解在类或者属性上，提供getter方法。getter方法的作用:获取单一实例变量的值
    //setter：注解在类或者属性上，提供setter方法。1.可以限制和检验setter方法传入的参数；2.隐藏对象内部数据结构；3.保持对象在每个状态的完整性。
    //setter和getter是用于封装的，一般我们会把类变量生命成private，这样的话只有类成员自身可以直接访问这个变量，而此类外部就不能直接访问，于是getter和setter就构成了从类成员外部访问这些变量的手段。因为getter和setter方法是public的，可以从类成员外部进行访问，所以我们在需要取得这个length的值就可以用getter，要改变值就用setter。
    //ToString，重写toString方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
