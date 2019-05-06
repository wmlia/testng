package com.lwm.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
            System.out.println("name="+name+",age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {"zhangsan",17},
                {"lisi",18},
                {"wangwu",20}
        };
        return o;
    }
}
