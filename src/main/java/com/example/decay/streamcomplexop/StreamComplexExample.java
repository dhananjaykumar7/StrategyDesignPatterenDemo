package com.example.decay.streamcomplexop;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamComplexExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry");

       /* List<Integer> lengths=words.stream()
                .collect(Collectors.mapping(String::length,Collectors.toList()));*/
        List<Integer> lengths= words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        Map<Boolean,List<Integer>> result=numbers
                .stream()
                .collect(Collectors.partitioningBy(x->x%2 ==0));

        System.out.println(result);

        List<Customer> customerList= new ArrayList<>();
        customerList.add(new Customer("Dhananjay",10000,"aa.a@com"));
        customerList.add(new Customer("DK",20000,"bb.a@com"));
        customerList.add(new Customer("Ram",30000,"cc.a@com"));
        customerList.add(new Customer("Ram",30000,"cc.a@com"));

        Map<Boolean,List<Customer>> maps= customerList.stream()
                .collect(Collectors
                        .partitioningBy(customer -> customer.getTotalSpend() >20000));

        System.out.println(maps);

        List email= customerList.stream()
                .collect(Collectors
                        .collectingAndThen(Collectors.toSet(),set->set.stream()
                                .map(Customer::getEmail).collect(Collectors.toList())));

        System.out.println(email);


    }
}
