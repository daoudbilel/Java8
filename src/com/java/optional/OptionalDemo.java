package com.java.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String email = "daoudbilel@gmail.com";//null;

        //of, empty, ofNullable
        Optional<Object> emptyOptinal = Optional.empty();
        System.out.println(emptyOptinal);

        Optional<String> emailOptinal = Optional.of(email);
        System.out.println(emailOptinal);

        Optional<String> stringOptinal = Optional.ofNullable(email);
        System.out.println(stringOptinal);

        Optional<String> stringOptional1 = Optional.ofNullable(email);

        if (stringOptional1.isPresent()) {
            System.out.println((stringOptional1.get()));
        } else {
            System.out.println("no value present");
        }

        Optional<String> stringOptional2 = Optional.ofNullable(email);
        String defaultOptinal = stringOptional2.orElse("default@gmail.com");
        System.out.println(defaultOptinal);


        Optional<String> stringOptional3 = Optional.ofNullable(email);
        String defaultOptinal1 = stringOptional3.orElseGet(() -> "default@gmail.com");
        System.out.println(defaultOptinal1);


        Optional<String> stringOptional4 = Optional.ofNullable(email);
        String optinalObject = stringOptional4.orElseThrow();
        System.out.println(optinalObject);

        Optional<String> stringOptional5 = Optional.ofNullable(email);
        String optinalObject1 = stringOptional5.orElseThrow(() -> new IllegalArgumentException("email is not exist"));
        System.out.println(optinalObject1);

        // ifPresent
        Optional<String> gender = Optional.of("male");
        Optional<String> emptyOptinal1 = Optional.empty();

        gender.ifPresent((s) -> System.out.println("value is present"));
        emptyOptinal1.ifPresent((s) -> System.out.println("no value  present"));


        //Filtre
        String result = " abc ";
        if (result != null && result.contains("abc")) {
            System.out.println(result);
        }

        Optional<String> optinalStr = Optional.of(result);
        optinalStr.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res));

    }
}
