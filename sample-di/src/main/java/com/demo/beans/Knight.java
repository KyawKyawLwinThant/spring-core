package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component
public class Knight {

    private MyClass myClass;

    private Quest dimsel;

    public Knight(Optional<MyClass> myClass, Quest dimsel) {
        //this.myClass = myClass;
        this.dimsel = dimsel;
    }

    public void setQuest(Quest quest) {
        this.dimsel = quest;
    }

    public String goQuest(){
        return dimsel.goQuest();
    }

    @Autowired
    public void setSpringBean(Collection<MyInterface> list){

    }







}
